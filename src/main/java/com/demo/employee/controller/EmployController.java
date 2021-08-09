package com.demo.employee.controller;


import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.entity.EmployDao;
import com.demo.employee.entity.Student;
import com.demo.employee.entity.StudentResponse;
import com.demo.employee.service.EmployService;
import com.demo.employee.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
public class EmployController {
	
	Logger log= org.slf4j.LoggerFactory.getLogger(EmployController.class);
	
	@Autowired
	 EmployService employService;
	@Autowired
	StudentService studentService;
	
	   @GetMapping("/getHello")
	    @ResponseBody
	    private String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	   @GetMapping("/getStudents")
		    public ResponseEntity< List<StudentResponse> >getStudents() throws JsonProcessingException {
		 System.out.println(""+studentService.getStudDetails());
	        return new ResponseEntity<>(studentService.getStudDetails(), HttpStatus.OK);
	    }
	
   
	}
  


