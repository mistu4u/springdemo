package com.example.salary.repository;

import com.example.salary.entity.Salary;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class SalaryRepository implements BaseRepository {
  Map<Integer, Salary> employeeSalary = new HashMap<>();

  @Override
  public void save(int employeeId, Salary salary) {
    employeeSalary.put(employeeId,salary);
  }

  @Override
  public Salary get(int employeeId) {
    return employeeSalary.get(employeeId);
  }
}
