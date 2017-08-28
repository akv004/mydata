package com.example.mydata.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.mydata.model.MyTable;

public interface MyTableRepository  extends CrudRepository<MyTable, Long>{
	
	  @Procedure(name = "get_department_name")
	    String getDepartmentNameById(@Param("department_id") Long id);
	
}
