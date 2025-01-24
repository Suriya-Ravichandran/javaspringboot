package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerService {

	 @Autowired
	    private CustomerRepository customerRepository;

	    public customer createAccount(customer customer) {
	        return customerRepository.save(customer);
	    }

	    public Optional<customer> getAccount(Long id) {
	        return customerRepository.findById(id);
	    }

}
