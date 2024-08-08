package com.Project_Z.Entity;

import java.util.HashSet;
import java.util.*;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Subjects {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int subjectId;
	
	private String name;
	@ManyToMany(mappedBy = "ss",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonBackReference
	private List<Student>  se=new ArrayList<>();
	
	
	

}
