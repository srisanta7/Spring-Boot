package com.sspringboot.employeemanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspringboot.employeemanagement.dao.EmployeeDao;
import com.sspringboot.employeemanagement.model.Employee;

@Service
public class EmployeeService {
	
	 @Autowired
	   private EmployeeDao employeeDao;
	
	public Employee createEmployee(Employee employee) {
		Employee result = employeeDao.save(employee);
		return result;
	}
    public Employee getEmployee(int id) {
    	Optional<Employee> optional = employeeDao.findById(id);
    	Employee employee = optional.orElse(null);
    	return employee;
    }
}
