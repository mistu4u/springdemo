package com.example.person.service;

import com.example.person.entity.Person;

import java.util.Optional;

public interface PersonService {
  void create(String id, Person p);

  Optional<Person> get(String id);
}
