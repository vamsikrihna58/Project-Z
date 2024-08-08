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
@RequestMapping("/subjects")
public class AdminController {
	
	@Autowired
	private ServiceClass sc;
	
	@GetMapping("/login")
	public  @ResponseBody String login(){
		return "welcome";
	}
	
	@PostMapping("/save")
	public @ResponseBody String saveStudent(@RequestBody Subjects s) {
		
		sc.saveSubjects(s);
		return "saved";
		
	}
	@GetMapping("/All")
	public List<Subjects> allStudents(){
		return sc.AllSubjects();
	}

}
