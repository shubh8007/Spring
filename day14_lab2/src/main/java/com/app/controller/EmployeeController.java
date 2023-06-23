package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService  empservice;
	
	
	
	
	
	public EmployeeController() {
		System.out.println("In default Contructor of Employee Controller"+getClass().getName());
		
	}
	@GetMapping("/list")
	public String getAllEmpList(@RequestParam Long deptId,Model map) {
		System.out.println("In employee list");
		map.addAttribute("emp_list",empservice.getAllEmployee(deptId));
		return "/emp/list";
		
	}

}
