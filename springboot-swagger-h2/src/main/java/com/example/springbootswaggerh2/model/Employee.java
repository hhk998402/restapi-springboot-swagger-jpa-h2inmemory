package com.example.springbootswaggerh2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "EMPLOYEE")
@ApiModel(description = "Employee details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "Auto generated employee id")
	private long id;
	
	@Column(name = "EMPLOYEE_NAME")
	@ApiModelProperty(notes = "Employee name")
	private String name;
	
	@Column(name = "EMPLOYEE_SALARY")
	@ApiModelProperty(notes = "Employee salary")
	private int salary;
	
	@Column(name = "DEPARTMENT")
	@ApiModelProperty(notes = "Employee department")
	private String department;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
