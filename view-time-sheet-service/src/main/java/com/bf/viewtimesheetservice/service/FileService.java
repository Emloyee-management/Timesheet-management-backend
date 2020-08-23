package com.bf.viewtimesheetservice.service;

import com.bf.viewtimesheetservice.repository.FileOperationDao;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/5
 */

@Service
public class FileService {
    @Resource
    private FileOperationDao dao;

    public boolean uploadFile(MultipartFile multipartFile, String id) throws IOException {
        return dao.uploadFile(multipartFile, id);
    }
//    public ResponseEntity download(String fileName, Integer id) throws FileNotFoundException {
//        return dao.download(fileName, id);
//    }
}
