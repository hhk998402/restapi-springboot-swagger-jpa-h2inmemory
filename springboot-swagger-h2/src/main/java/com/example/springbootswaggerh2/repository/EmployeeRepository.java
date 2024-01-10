package com.example.springbootswaggerh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootswaggerh2.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom query to find a user by email
    Employee findByEmailId(String emailId);

    boolean existsEmployeeByEmailId(String emailId);
}
