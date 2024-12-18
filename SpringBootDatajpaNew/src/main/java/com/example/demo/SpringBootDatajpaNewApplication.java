package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.TeacherRepository1;

@SpringBootApplication
public class SpringBootDatajpaNewApplication implements CommandLineRunner {
      
	@Autowired
	private TeacherRepository1 teacherRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatajpaNewApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Teacher1 teacher1=new Teacher1();
		teacher1.setName("Darshan");
		teacher1.setSubject("Java");
		teacher1.setEmail("abc@gmail.com");
		
		Teacher1 teacher2=new Teacher1();
		teacher2.setName("Roshan");
		teacher2.setSubject("Corejava");
		teacher2.setEmail("xyz@gmail.com");
		
		teacherRepository.save(teacher2);
		System.out.println(teacherRepository.findBySubject("Physics"));
		System.out.println(teacherRepository.findByEmail("john.com"));
		
	}

}
