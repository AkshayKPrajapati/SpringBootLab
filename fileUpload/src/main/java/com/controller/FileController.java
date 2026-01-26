package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class FileController {

    
    
    @PostMapping("file")
    public String fileUploadHandler(@RequestParam ("file") MultipartFile file) {
    	System.out.println(file.getOriginalFilename());
        return "file uploaded";
    }
    
}