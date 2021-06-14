package com.example.person.service;

import com.example.person.PersonRepository;
import com.example.person.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Qualifier("personserviceimpl")
public class PersonServiceImpl implements PersonService{
  @Autowired
  private PersonRepository personRepository;
  @Override
  public void create(String id, Person p) {
    personRepository.save(id,p);
  }

  @Override
  public Optional<Person> get(String id) {
    return personRepository.get(id);
  }
}
