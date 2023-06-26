package com.app.service;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.app.dto.ApiResponse;
import com.app.repository.EmployeeRepository;
@Service
@Transactional
public class ImageHandlingServiceImpl implements ImagehandligService {
      //dep:emp dao i/f
	@Autowired
	private EmployeeRepository empRepo;
	//how to access property from app property file
	//SPEL:Spring Expression language
	@Value("${upload.location}")
	private String uploadFolder;
	//add custom init method to cjeck if folder exists
      //if not create a new one
	@PostConstruct
	public void myInit() {
		System.out.println("in init"+uploadFolder);
		File dir=new File(uploadFolder);
		if(dir.exists()) {
			System.out.println("Folder Already Exists");
		}
		else {
			dir.mkdirs();//creating required dirs
			System.out.println("Created a new Folder");
		}
	}
	@Override
	public ApiResponse uploadImageTofolder(Long empId, MultipartFile file) {
		// TODO Auto-generated method stub
		return null;
	}

}
