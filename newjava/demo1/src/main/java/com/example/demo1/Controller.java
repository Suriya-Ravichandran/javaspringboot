package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Employee;
import com.example.demo1.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class Controller {
    
    @Autowired
    private EmployeeService employeeService;
    
    @PostMapping("/add")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws Exception{
        Employee employeeSavedToDB = this.employeeService.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSavedToDB, HttpStatus.CREATED);
    }
}
