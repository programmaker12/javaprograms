package com.tns.jpastart.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")	//value for manager rows in Discriminator column
public class Manager extends Employee {
	
	private String departmentName;

	private String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
