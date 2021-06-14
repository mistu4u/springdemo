package com.example.salary.controller;

import com.example.salary.entity.Salary;
import com.example.salary.entity.request.SalaryWithEmployeeID;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/api/v1/salary")
@EnableFeignClients
public interface SalaryController {

  @GetMapping(value = "{id}")
  public ResponseEntity<Salary> getSalaryById(@PathVariable int id);

  @PostMapping
  public ResponseEntity<Void> postSalary(@Validated @RequestBody SalaryWithEmployeeID salaryWithEmployeeID);

}
