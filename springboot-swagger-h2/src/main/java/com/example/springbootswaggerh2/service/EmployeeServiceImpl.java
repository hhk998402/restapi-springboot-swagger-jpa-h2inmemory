package com.example.springbootswaggerh2.service;

import java.util.List;

import com.example.springbootswaggerh2.exception.UserAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootswaggerh2.exception.ResourceNotFoundException;
import com.example.springbootswaggerh2.model.Employee;
import com.example.springbootswaggerh2.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		if(employeeRepository.existsEmployeeByEmailId(employee.getEmailId())) {
			throw new UserAlreadyExistsException("User with this emailID already exists");
		}
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employees", "id", "employeeId"));
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployeeById(Long id, Employee employee) {
		Employee employeeDetail = this.getEmployeeById(id);
		employeeDetail.setName(employee.getName());
		employeeDetail.setSalary(employee.getSalary());
		employeeDetail.setDepartment(employee.getDepartment());
		return employeeRepository.save(employeeDetail);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		Employee employee = this.getEmployeeById(id);
		employeeRepository.delete(employee);
	}

}
