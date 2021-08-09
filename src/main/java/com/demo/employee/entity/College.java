package com.demo.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="college")
public class College {
//	CREATE TABLE College (
//		    id int,
//		    collegename varchar(255),
//		    collegeaddr varchar(255),
//			PRIMARY KEY (id)
//		);
	@Id
	private Integer id;
	private String collegename;
	private String collegeaddr;
	
	/*@OneToOne(mappedBy = "college")
	    private Address address;*/
	
/*	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegeaddr() {
		return collegeaddr;
	}
	public void setCollegeaddr(String collegeaddr) {
		this.collegeaddr = collegeaddr;
	}
	
	
}
