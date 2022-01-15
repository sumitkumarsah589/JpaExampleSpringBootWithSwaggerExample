package com.demo.jpaexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpaexample.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByName(String name);

	Student findByCity(String city);

	String findById(int i);

	List<Student> findAll();
	
}
