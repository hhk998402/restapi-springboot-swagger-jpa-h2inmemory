package com.example.springbootswaggerh2.service;

import java.util.List;

import com.example.springbootswaggerh2.model.Employee;

public interface EmployeeService {
	
	public Employee createEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public List<Employee> getEmployees();
	public Employee updateEmployeeById(Long id, Employee employee);
	public void deleteEmployeeById(Long id);

}
