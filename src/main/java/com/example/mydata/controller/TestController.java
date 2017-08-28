package com.example.mydata.controller;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.mydata.model.Customer;
import com.example.mydata.repository.CustomerRepository;

@Controller
public class TestController {

	
	@Autowired
    DataSource dataSource;

	
	@Autowired
	CustomerRepository customerRepository;
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		List<Customer> customers = customerRepository.findAll();
		
		System.out.println(customers);
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
