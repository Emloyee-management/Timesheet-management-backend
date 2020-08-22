package com.bf.viewtimesheetservice.repository.impl;

import com.bf.viewtimesheetservice.constant.Constant;
import com.bf.viewtimesheetservice.repository.FileOperationDao;
import com.bf.viewtimesheetservice.util.TrimSpace;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/5
 */

@Repository
//@Transactional
public class FileOperationImpl implements FileOperationDao {
    TrimSpace ts = new TrimSpace();//replace space in the file name

    
    /**
    * @description: 
    * @param: [multipartFile, id]
    * @return: boolean
    * @date: 2020/8/22
    */
    @Override
    public boolean uploadFile(MultipartFile multipartFile, String id) throws IOException {
        String uploadedFileName = "";
        String[] allowTypes = new String[] {"pdf", "jpg", "jpeg", "xls", "docx", "doc"};
        String classPath = ts.Trim(Constant.CLASS_PATH);
            if (multipartFile != null) {
                long size = multipartFile.getSize();
                if(size > 1024 * 1024)
                    return false;
                uploadedFileName = multipartFile.getOriginalFilename();
                String suffix = uploadedFileName.substring(uploadedFileName.lastIndexOf(".") + 1, uploadedFileName.length());
                if (!Arrays.asList(allowTypes).contains(suffix))
                    return false;
                String filepath = classPath + "\\" + id;
                File file = new File(filepath);
                if (!file.exists()) {
                    file.mkdirs();
                }
                multipartFile.transferTo(new File(file + "\\" + uploadedFileName));//save the file to server
            }
        return true;

    }

//    @Override
//    public ResponseEntity download(String fileName, Integer id) throws FileNotFoundException {
//        String classPath = ts.Trim(Constant.CLASS_PATH);
//        String filePath = classPath + "\\" + id;
//        File file = new File(filePath + "\\" + fileName);
////        System.out.println(file);
//        final HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Type", "application/pdf");
//        headers.add("Content-Disposition", "attachment; filename=" + file.getName() );
//        InputStreamResource isr = new InputStreamResource(new FileInputStream(file));
//        return new ResponseEntity<InputStreamResource>(isr, headers, HttpStatus.OK);
//    }
}
