package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}