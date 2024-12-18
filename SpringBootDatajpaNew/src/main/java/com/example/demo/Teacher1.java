package com.example.demo;

import java.time.LocalDateTime;


import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Teacher1 {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // This will auto-generate IDs for the Teacher entity
	private long id;
	private String Name;
	private String subject;
	private String email;
	@Column(name="created_Date",updatable=false)
	
	private LocalDateTime createDate;
	@Column(name="updated_Date",insertable=false)
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	

}
