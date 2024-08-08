package com.Project_Z.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project_Z.Entity.Student;
import com.Project_Z.Entity.Subjects;
import com.Project_Z.Repository.StudentsRepository;
import com.Project_Z.Repository.SubjectsRepository;

@Service
public class ServiceClass {
	@Autowired
	private StudentsRepository sr;
	@Autowired
	private SubjectsRepository se;
	
	public void createStudent(Student s) {
		sr.save(s);
		
	}
	public List<Student> AllStudesnts(){
		return sr.findAll();
	}
	
	public void saveSubjects(Subjects s) {
		se.save(s);
		
	}
	public List<Subjects> AllSubjects(){
		return se.findAll();
	}

	
	
	

}
