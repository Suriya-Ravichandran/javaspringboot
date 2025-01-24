package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class customerController {
	@Autowired
    private CustomerService customerService;

    @PostMapping
    public customer createAccount(@RequestBody customer account) throws IOException{
        return customerService.createAccount(account);
    }
    
    @GetMapping("/{id}")
    public customer getAccount(@PathVariable Long id) {
        return customerService.getAccount(id).orElseThrow(() -> new RuntimeException("Account not found"));
    }
}
