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

import com.everis.model.Family;
import com.everis.service.IFamilyService;

@RestController
@RequestMapping("/families")
public class FamilyController {
	
	@Autowired
	private IFamilyService service;

	@GetMapping
	public List<Family> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public Family listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Family create(@RequestBody Family fam) {
		return service.create(fam);
	}

	@PutMapping
	public Family update(@RequestBody Family fam) {
		return service.create(fam);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		Family fam = service.read(id);
	}
	
	/*
	@Autowired
	private FamilyRepository familyRepository;
	
	@GetMapping("/familys")
	public List<Family> getAllStudents() {
	    return familyRepository.findAll();
	}*/

}
