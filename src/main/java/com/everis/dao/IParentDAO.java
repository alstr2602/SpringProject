package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Parent;

public interface IParentDAO extends JpaRepository<Parent, Integer> {

}
