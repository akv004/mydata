package com.example.mydata.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.mydata.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findAll();
	Customer findOne(Long id);


}
