package com.wipcamp.masterdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipcamp.masterdata.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
