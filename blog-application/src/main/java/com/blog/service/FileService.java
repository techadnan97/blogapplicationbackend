package com.blog.service;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	String fileUpload(MultipartFile multipartFile,String Path)throws IOException;
	Resource loadImage(String Path,String fileName)throws IOException;

}
