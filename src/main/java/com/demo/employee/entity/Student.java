package com.demo.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
//	CREATE TABLE Student (
//		    id int,
//		    LastName varchar(255),
//		    FirstName varchar(255),
//		    Address varchar(255),
//		    City varchar(255),
//			PRIMARY KEY (id)
//		);
	
	@Id
	private Integer id;
	@Column(name="LastName")
	private String LastName;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="addressId"  ,insertable = false, updatable = false)
	private Integer addressId;

	@Column(name="City")
	private String City;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
}
