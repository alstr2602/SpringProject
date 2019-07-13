package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.IStudentDAO;
import com.everis.model.Student;
import com.everis.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDAO dao;

	@Override
	public Student create(Student obj) {
		return dao.save(obj);
	}

	@Override
	public Student update(Student obj) {
		return dao.save(obj);
	}

	@Override
	public List<Student> list() {
		return dao.findAll();
	}

	@Override
	public Student read(Integer id) {
		Optional<Student> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Student();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}
}
