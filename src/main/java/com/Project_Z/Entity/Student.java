package com.Project_Z.Entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	
	private String name;
	
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Subjects.class)
	@JoinTable(name="MYTABLE",joinColumns = {
			@JoinColumn(name="student_ID",referencedColumnName = "id")},
	 inverseJoinColumns = {
			 @JoinColumn(name="subject_ID",referencedColumnName = "subjectId")}
	 
	
	)
	private List<Subjects> ss=new ArrayList<>();

}
