package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
	//add a method to list of employee
	List<Employee> getAllEmployeesByDeptid(Long deptId);

}
