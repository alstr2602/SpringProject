package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.IFamilyDAO;
import com.everis.model.Family;
import com.everis.service.IFamilyService;

@Service
public class FamilyServiceImpl implements IFamilyService {

	@Autowired
	private IFamilyDAO dao;

	@Override
	public Family create(Family obj) {
		return dao.save(obj);
	}

	@Override
	public Family update(Family obj) {
		return dao.save(obj);
	}

	@Override
	public List<Family> list() {
		return dao.findAll();
	}

	@Override
	public Family read(Integer id) {
		Optional<Family> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Family();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);

	}
}
