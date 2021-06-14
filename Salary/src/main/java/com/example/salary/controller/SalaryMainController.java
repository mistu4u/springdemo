package com.example.salary.controller;

import com.example.salary.entity.Salary;
import com.example.salary.entity.request.SalaryWithEmployeeID;
import com.example.salary.service.SalaryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SalaryMainController implements SalaryController {
  private final SalaryService salaryService;

  @Override
  public ResponseEntity<Salary> getSalaryById(int id) {
    Salary salary = salaryService.getSalary(id);
    return ResponseEntity.status(HttpStatus.OK).body(salary);

  }

  @Override
  public ResponseEntity<Void> postSalary(SalaryWithEmployeeID salaryWithEmployeeID) {
    salaryService.saveSalary(salaryWithEmployeeID);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
