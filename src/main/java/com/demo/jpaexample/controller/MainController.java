package com.demo.jpaexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpaexample.model.Student;
import com.demo.jpaexample.service.StudentService;

@RestController
public class MainController {

	@Autowired
	StudentService studentService;

	@RequestMapping(method = RequestMethod.POST, value = "/create")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s) {
		Student student = studentService.create(s);
		return ResponseEntity.ok(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getStudent")
	public ResponseEntity<Student> getStudent(@RequestParam String name) {
		Student student = studentService.byName(name);
		return ResponseEntity.ok(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getByCity")
	public ResponseEntity<Student> getByCity(@RequestParam String city) {
		Student student = studentService.byCity(city);
		return ResponseEntity.ok(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/getById")
	public ResponseEntity<Student> getById(@RequestParam int id) {
		Student student = studentService.byId(id);
		return ResponseEntity.ok(student);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getAll")
	public ResponseEntity<List<Student>> getAll() {
		List<Student> students = studentService.getAll();
		return ResponseEntity.ok(students);
	}
	
}
