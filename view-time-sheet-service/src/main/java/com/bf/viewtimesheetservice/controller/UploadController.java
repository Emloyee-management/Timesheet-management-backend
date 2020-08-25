package com.bf.viewtimesheetservice.controller;

import com.bf.viewtimesheetservice.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


/**
 * @description: Controller for file uploading and downloading
 * @author: Yang Yuan
 * @Time: 15:14
 */

@RestController
public class UploadController {
    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;
    @Resource
    private FileService fileService;

    @RequestMapping("/upload")
    boolean upload(@RequestParam(value = "file", required = false) MultipartFile multipartFile, @RequestParam("id") String id) throws IOException {
        boolean res;
//        System.out.println(request);
        try {
             res = fileService.uploadFile(multipartFile, id);
        }
        catch (Exception e) {
            return false;
        }
        return res;
//        response.sendRedirect("/download.html");
    }

    
//    @RequestMapping("/download")
//    ResponseEntity download(@RequestParam("fileName") String fileName, @RequestParam("id") Integer id) throws FileNotFoundException {
//        return fileService.download(fileName, id);
//    }
}
