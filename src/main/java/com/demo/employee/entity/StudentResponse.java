package com.demo.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentResponse {
	
	@Id
	private Integer id;
	private  String LastName;
	@Column(name = "first_name")
	private  String FirstName;
	private  String Address;
	private  String City;
	private String dno;
	private String line1;
	private  String line2;
	private  String district;
	private  String collegename;
	private  String collegeaddr;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
	@Override
	public String toString() {
		return "StudentResponse [id=" + id + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Address="
				+ Address + ", City=" + City + ", dno=" + dno + ", line1=" + line1 + ", line2=" + line2 + ", district="
				+ district + ", collegename=" + collegename + ", collegeaddr=" + collegeaddr + "]";
	}
	
	
	
	
	

}
