package com.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Student;
import com.everis.service.IStudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private IStudentService service;

	@GetMapping
	public List<Student> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public Student listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Student create(@RequestBody Student stu) {
		return service.create(stu);
	}

	@PutMapping
	public Student update(@RequestBody Student stu) {
		return service.create(stu);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Student par = service.read(id);
	}
	

}
