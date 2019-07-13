package com.everis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.model.FamilyMember;

public interface IFamilyMemberDAO extends JpaRepository<FamilyMember, Integer> {

}
