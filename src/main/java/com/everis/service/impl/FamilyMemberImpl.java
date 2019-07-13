package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.IFamilyMemberDAO;
import com.everis.model.FamilyMember;
import com.everis.service.IFamilyMemberService;

@Service
public class FamilyMemberImpl implements IFamilyMemberService {
	
	@Autowired
	private IFamilyMemberDAO dao;

	@Override
	public FamilyMember create(FamilyMember obj) {
		return dao.save(obj);
	}

	@Override
	public FamilyMember update(FamilyMember obj) {
		return dao.save(obj);
	}

	@Override
	public List<FamilyMember> list() {
		return dao.findAll();
	}

	@Override
	public FamilyMember read(Integer id) {
		Optional<FamilyMember> op = dao.findById(id);
		return op.isPresent() ? op.get() : new FamilyMember();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

}
