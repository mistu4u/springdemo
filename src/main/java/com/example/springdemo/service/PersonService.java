package com.example.springdemo.service;

import com.example.springdemo.entity.Person;

import java.util.Optional;

public interface PersonService {
  void create(String id, Person p);

  Optional<Person> get(String id);
}
