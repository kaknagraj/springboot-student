package com.demo.employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.employee.entity.Student;
import com.demo.employee.entity.StudentResponse;



@Repository
public interface StudentRepository extends JpaRepository<StudentResponse, Integer>{
	
//		@Query("SELECT t FROM Student t")
	 @Query("select s.id,s.LastName,s.FirstName,s.City,m.dno,m.line1,m.line2,m.district,d.collegename,d.collegeaddr from Student s, \r\n" + 
	 		"Address m, College d where s.addressId = m.id and \r\n" + 
	 		"m.clgId = d.id")
	    public List<StudentResponse> findById();
	 @Query("select s.id,s.LastName,s.FirstName,s.City,m.dno,m.line1,m.line2,m.district,d.collegename,d.collegeaddr from Student s, \r\n" + 
		 		"Address m, College d where s.addressId = m.id and \r\n" + 
		 		"m.clgId = d.id")
	 public List<StudentResponse> findAllSt();
}
//where s.address_id = m.id and \r\n" +"m.clg_id = d.id"