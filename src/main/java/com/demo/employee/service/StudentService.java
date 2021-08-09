package com.demo.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employee.entity.Student;
import com.demo.employee.entity.StudentResponse;
import com.demo.employee.repo.StudentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;





@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<StudentResponse> getStudDetails() throws JsonProcessingException {
		System.out.println(studentRepository.findById());
//		ObjectMapper mapper = new ObjectMapper();
//		String newJsonData = mapper.writeValueAsString(studentRepository.findById());
//		System.out.println(newJsonData.toString());st
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+studentRepository.findAllSt().toString());
	return	studentRepository.findById();
		
	}

	
}
