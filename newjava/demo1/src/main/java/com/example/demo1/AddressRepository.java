package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo1.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}