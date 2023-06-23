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
private EmployeeService empService;
public EmployeeController() {
	System.out.println("In employe ctr"+getClass().getName());
}
//@RequestParam :annotation to bind incoming rq patram-->
//method argument,does the parsing also!
//MATCH RQ param name with method arg name
@PostMapping("/list")
public String listEmpByDept(@RequestParam Long dept_id,Model map) {
	System.out.println("in list emps by dept"+dept_id);
	map.addAttribute("emp_list", empService.getAllEmployeesByDeptid(dept_id));
	
	return "/emp/list";
	
}
@GetMapping("/login")
public String showLoginForm() {
	System.out.println("In log in form");
	return "/emp/login";
	
}
@PostMapping
public String processLoginForm(@RequestParam )

}
