package com.bf.viewtimesheetservice.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileOperationDao {
    boolean uploadFile(MultipartFile multipartFile, String id) throws IOException;
//    ResponseEntity download(String fileName, Integer id) throws FileNotFoundException;

}
