package com.my.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.springboot.thymeleafdemo.entity.Employee;
import com.my.springboot.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	//add mapping for "/list"
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		
		//get employees from db
		List<Employee> theEmployee = employeeService.findAll();
		
		//add to the spring model
		theModel.addAttribute("employees", theEmployee);
		
		return "list-employees";
		
	}
	
}
