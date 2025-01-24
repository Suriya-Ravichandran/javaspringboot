package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.Address;
import com.example.demo1.AddressRepository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRepository addressRepository;
    
    public Address addAddress(Address address) {
        Address addressSavedToDB = this.addressRepository.save(address);
        return addressSavedToDB;
    }

}
