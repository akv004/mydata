package com.example.mydata.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mydata.dto.DepartmentDto;
import com.example.mydata.repository.MyTableRepository;

@RestController
public class MyController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    MyTableRepository myTableRepository;
    @RequestMapping("/getdepbyid")
    public DepartmentDto getdepbyid(@RequestParam(value="id", defaultValue="1") Long id) {
    	String departmentName = myTableRepository.getDepartmentNameById(id);
    	
    	DepartmentDto d = new DepartmentDto();
    	d.setId(1l);
    	d.setLocation("asdf");
    	d.setName(departmentName);
    	return d;
    }
}
