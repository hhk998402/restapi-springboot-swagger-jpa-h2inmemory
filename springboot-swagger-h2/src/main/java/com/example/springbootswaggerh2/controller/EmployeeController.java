package com.example.springbootswaggerh2.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootswaggerh2.model.Employee;
import com.example.springbootswaggerh2.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/employees")
@Api(value = "Employee service", description = "Service to manage employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping()
	@ApiOperation(value = "Create employee", response = Employee.class)
	@ResponseStatus(value = HttpStatus.CREATED)
	@ApiResponses(value = {
			@ApiResponse(code = 201, response = Employee.class, message = "Employee created successfully"),
			@ApiResponse(code = 400, message = "Invalid employee request"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "You are forbidden to create employee"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	public Employee createEmployees(@Valid @RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping()
	@ApiOperation(value = "View list of employees", response = Employee.class, responseContainer = "List" )
	@ResponseStatus(value = HttpStatus.OK)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved employee list", response = Employee.class, responseContainer = "List"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "You are forbidden to view employee list"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "View employee details by id", response = Employee.class)
	@ResponseStatus(value = HttpStatus.OK)
	@ApiResponses(value = {
			@ApiResponse(code = 200, response = Employee.class, message = "Successfully retrieved employee by id"),
			@ApiResponse(code = 400, message = "Invalid request"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "You are forbidden to view employee by id"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	public Employee getEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "Update employee details by id", response = Employee.class)
	@ResponseStatus(value = HttpStatus.OK)
	@ApiResponses(value = {
			@ApiResponse(code = 200, response = Employee.class, message = "Successfully updated employee by id"),
			@ApiResponse(code = 400, message = "Invalid request"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "You are forbidden to update employee by id"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	public Employee updateEmployeeById(@Valid @RequestBody Employee employee, @PathVariable(value = "id") Long id) {
		return employeeService.updateEmployeeById(id, employee);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Delete employee details by id", response = Employee.class)
	@ResponseStatus(value = HttpStatus.OK)
	@ApiResponses(value = {
			@ApiResponse(code = 200, response = Employee.class, message = "Successfully deleted employee by id"),
			@ApiResponse(code = 400, message = "Invalid request"),
			@ApiResponse(code = 401, message = "You are not authorized to access the resource"),
			@ApiResponse(code = 403, message = "You are forbidden to delete employee by id"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found"),
			@ApiResponse(code = 500, message = "Internal server error")
	})
	public ResponseEntity<?> deleteEmployeeById(@PathVariable(value = "id") Long id) {
		employeeService.deleteEmployeeById(id);
		return ResponseEntity.ok().build();
	}

}
