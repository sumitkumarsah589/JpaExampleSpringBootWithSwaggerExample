package com.demo.jpaexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jpaexample.model.Student;
import com.demo.jpaexample.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	public Student byName(String name) {
		return studentRepository.findByName(name);
	}
	
	public Student byId(int id) {
		return studentRepository.getById(id);
	}
	
	public Student byCity(String city) {
		return studentRepository.findByCity(city);
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}
	
}
