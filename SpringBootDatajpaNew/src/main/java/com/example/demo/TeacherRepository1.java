package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.Teacher1;

@EnableJpaRepositories
public interface TeacherRepository1  extends JpaRepository<Teacher1 , Long> {
// select * from teacher where subject=?
public List<Teacher1> findBySubject(String subject)	;
//select * from teacher where email?
public List<Teacher1> findByEmail(String email);
public List<Teacher1>findBySubjectAndEmail(String subject,String email);
public List<Teacher1>findBySubjectOrEmail(String subject,String email);



}
