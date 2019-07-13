package com.everis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.model.Parent;
import com.everis.service.IParentService;

@RestController
@RequestMapping("/parents")
public class ParentController {

	@Autowired
	private IParentService service;
	//
	@GetMapping
	public ResponseEntity<List<Parent>> list(){
		List<Parent> list = service.list();
		return new ResponseEntity<List<Parent>>(list, HttpStatus.OK);		
	}
	//
	/*
	@GetMapping(value = "/list")
	public List<Parent> list() {
		return service.list();
	}*/

	@GetMapping(value = "/{id}")
	public Parent listForId(@PathVariable("id") Integer id) {
		return service.read(id);
	}

	@PostMapping
	public Parent create(@RequestBody Parent par) {
		return service.create(par);
	}

	@PutMapping
	public Parent update(@RequestBody Parent par) {
		return service.create(par);
	}

	@DeleteMapping(value = "{id}")
	public void delete(@PathVariable("id") Integer id) {
		Parent par = service.read(id);
	}

}
