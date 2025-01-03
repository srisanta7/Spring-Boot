package com.sspringboot.employeemanagement.controller;

import org.springframework.http.ResponseEntity;
import com.sspringboot.employeemanagement.model.Employee;
import com.sspringboot.employeemanagement.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	 @Value("${api.key}")
	 private String API_KEY;
    @PostMapping("/employees")
    public ResponseEntity<?> createEmployee(
            @RequestHeader(value = "Authorization", required = true) String apiKey,
            @RequestBody Employee employee) {
        if (apiKey == null || !apiKey.equals(API_KEY)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Unauthorized");
        }
        Employee response = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeDetails(
            @RequestHeader(value = "Authorization", required = false) String apiKey,
            @PathVariable("id") int employeeId) {

        // Validate the access token
        if (apiKey == null || !apiKey.equals(API_KEY)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Access Token Expired or Invalid");
        }
        Employee employee = employeeService.getEmployee(employeeId);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee Not Found");
        }
        return ResponseEntity.ok(employee);        
    }
}

