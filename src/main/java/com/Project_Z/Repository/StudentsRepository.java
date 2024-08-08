package com.Project_Z.Repository;

import javax.swing.JPanel;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project_Z.Entity.Student;

public interface StudentsRepository  extends JpaRepository<Student, Integer>{

}
