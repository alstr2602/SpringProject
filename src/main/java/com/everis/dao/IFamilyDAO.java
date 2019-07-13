package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.Family;

public interface IFamilyDAO extends JpaRepository<Family, Integer> {

}
