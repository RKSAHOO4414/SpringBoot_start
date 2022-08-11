package com.my.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	//load employee data
	
	private List<Employee> theEmployee;
	
	@PostConstruct
	private void loadData() {
		
		//create employees
		Employee empl = new Employee(1, "Leslie", "Andrews", "leslie@luv2code.com");
		Employee emp2 = new Employee(2, "Emma", "Baumgarten", "emma@luv2code.com");
		Employee emp3 = new Employee(3, "Avani", "Gupta", "avani@luv2code.com");
		
		//create the list
		theEmployee = new ArrayList<>();
		
		//add to the list
		theEmployee.add(empl);
		theEmployee.add(emp2);
		theEmployee.add(emp3);	
	}
	
	//add mapping for "/list"
	@GetMapping("/list")
	public String listEmployee(Model theModel) {
		
		//add to the spring model
		theModel.addAttribute("employees", theEmployee);
		
		return "list-employees";
		
	}
	
}
