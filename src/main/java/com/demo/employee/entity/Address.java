package com.demo.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

/*	CREATE TABLE Address (
		    id int,
		    dno varchar(255),
		    line1 varchar(255),
		    line2 varchar(255),
		    district varchar(255),
			PRIMARY KEY (id)
		);*/
	
	@Id
	private Integer id;
	private String dno;
	private String line1;
	private String line2;
	private String district;
	@Column(name="clg_id" , insertable = false, updatable = false)
	private Integer clgId;
	
/*	//@OneToOne(mappedBy = "address")
    private Student student;*/
	

/*	 public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}*/
/*	@OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "clg_id", referencedColumnName = "id" )
	    private College college;
	*/
/*	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	
}
