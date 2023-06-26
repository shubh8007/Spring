package com.app.service;

import org.springframework.web.multipart.MultipartFile;

import com.app.dto.ApiResponse;

public interface ImagehandligService {
//upload image
	
	ApiResponse uploadImageTofolder(Long empId,MultipartFile file);
}
