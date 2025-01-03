package com.sspringboot.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sspringboot.employeemanagement.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
