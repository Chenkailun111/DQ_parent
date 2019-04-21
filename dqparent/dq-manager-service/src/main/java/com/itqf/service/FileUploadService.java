package com.itqf.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface FileUploadService {


    Map<String ,Object>  upload(MultipartFile file);


}
