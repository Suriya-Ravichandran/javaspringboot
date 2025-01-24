package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
