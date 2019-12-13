package com.wipcamp.masterdata.models;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
}
