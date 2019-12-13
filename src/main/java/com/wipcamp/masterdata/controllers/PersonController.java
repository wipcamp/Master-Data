package com.wipcamp.masterdata.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipcamp.masterdata.models.Person;

@RestController
public class PersonController {

	@GetMapping("/wippo")
	public ResponseEntity<Person> getPerson() {
		Person person = new Person("WIPPO!");
		return new ResponseEntity<Person>(person, HttpStatus.OK);
	}
}
