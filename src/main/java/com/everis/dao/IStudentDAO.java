package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Student;

public interface IStudentDAO extends JpaRepository<Student, Integer> {

}
