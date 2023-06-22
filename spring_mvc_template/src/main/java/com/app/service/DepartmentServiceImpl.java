package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.Departmentdao;
import com.app.pojos.Department;
@Service //Mandatory Annotation to tell spring Container,following is a spring bean
//:containing B.L
@Transactional //pick it from org.springframework......
//Mandatory Annotation to tell sc manage annotation automatically
public class DepartmentServiceImpl implements DepartmentService {
     //dependency:dao layer i/f
	@Autowired //by Type:field level D.I
	private Departmentdao deptDao;
	@Override
	public List<Department> getAllDepts() {
		
		return deptDao.getAllDepartments();
	}

}
