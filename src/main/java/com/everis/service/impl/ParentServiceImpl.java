package com.everis.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.dao.IParentDAO;
import com.everis.model.Parent;
import com.everis.service.IParentService;

@Service
public class ParentServiceImpl implements IParentService {
	
	@Autowired
	private IParentDAO dao;

	@Override
	public Parent create(Parent obj) {
		return dao.save(obj);
	}

	@Override
	public Parent update(Parent obj) {
		return dao.save(obj);
	}

	@Override
	public List<Parent> list() {
		return dao.findAll();
	}

	@Override
	public Parent read(Integer id) {
		Optional<Parent> op = dao.findById(id);
		return op.isPresent() ? op.get() : new Parent();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

}
