package com.example.springdemo;

import com.example.springdemo.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class PersonRepository {
  Map<String, Person> persons = new HashMap<>();

  public void save(String id, Person p) {
    persons.computeIfAbsent(id, k -> p);
  }

  public Optional<Person> get(String id) {
    return Optional.ofNullable(persons.get(id));
  }
}
