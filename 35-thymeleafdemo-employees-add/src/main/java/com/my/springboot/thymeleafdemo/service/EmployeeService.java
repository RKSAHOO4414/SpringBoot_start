package com.my.springboot.thymeleafdemo.service;

import java.util.List;

import com.my.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmloyee);
	
	public void deleteById(int theId);
}
