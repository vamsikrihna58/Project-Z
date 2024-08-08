package com.Project_Z.TestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project_Z.Entity.Student;
import com.Project_Z.Entity.Subjects;

import com.Project_Z.Service.ServiceClass;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private ServiceClass sc;
	
	@PostMapping("/save")
	public @ResponseBody String saveStudent(@RequestBody Student s) {
		System.out.println("jhgfgdflgdfnhdkhdjhdnhlds");
		sc.createStudent(s);
		return "saved";
		
	}
	@GetMapping("/All")
	public List<Student> allStudents(){
		return sc.AllStudesnts();
	}
	
	

}
