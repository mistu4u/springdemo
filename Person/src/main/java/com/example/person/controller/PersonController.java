package com.example.person.controller;

import com.example.person.entity.Person;
import com.example.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
  private final PersonService personService;

  @Autowired
  public PersonController(@Qualifier("personserviceimpl") PersonService personService) {
    this.personService = personService;
  }

  @GetMapping(value = "{id}")
  public ResponseEntity<Person> getPerson(@PathVariable String id) {
    Person person = personService.get(id).orElseThrow(() -> new CustomException(601, "Person not found"));
    return ResponseEntity.status(HttpStatus.OK).body(person);
  }

  @PostMapping
  public ResponseEntity<Void> createPerson(@Validated @RequestBody Person p) {
    personService.create(p.getId(), p);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
