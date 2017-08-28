package com.example.mydata.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;


@Entity
@NamedStoredProcedureQueries({
	
	@NamedStoredProcedureQuery(name="get_department_name",
			                   procedureName="TEST_PKG.get_department_name", 
			                   parameters={@StoredProcedureParameter(mode=ParameterMode.IN, name="department_id", type = Long.class),
			                		       @StoredProcedureParameter(mode = ParameterMode.OUT, name = "department_name", type = String.class)})
	
})
public class MyTable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	Long id;
}
