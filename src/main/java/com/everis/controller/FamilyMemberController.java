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

import com.everis.model.FamilyMember;
import com.everis.service.IFamilyMemberService;

@RestController
@RequestMapping("/familyMember")
public class FamilyMemberController {
	
	@Autowired
	private IFamilyMemberService service;

	@GetMapping
	public List<FamilyMember> list() {
		return service.list();
	}

	@GetMapping(value = "/{id}")
	public FamilyMember listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public FamilyMember create(@RequestBody FamilyMember fam) {
		return service.create(fam);
	}

	@PutMapping
	public FamilyMember update(@RequestBody FamilyMember fam) {
		return service.create(fam);
	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable("id") Integer id) {
		FamilyMember fam = service.read(id);
	}

}
