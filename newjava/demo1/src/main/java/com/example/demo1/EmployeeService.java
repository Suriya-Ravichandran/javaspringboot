package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Address;
import com.example.demo1.Employee;
import com.example.demo1.EmployeeRepository;



@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private AddressService addressService;
    
    @Transactional
    public Employee addEmployee(Employee employee) throws Exception {
        Employee employeeSavedToDB = this.employeeRepository.save(employee);
        
        // we will initialize the 
        // address object as null
        Address address = new Address();
        //Address address = null;
        address.setId(123L);
        address.setAddress("Varanasi");
        address.setEmployee(employee);
        
        // calling addAddress() method
        // of AddressService class
        this.addressService.addAddress(address);
        return employeeSavedToDB;
    }
}