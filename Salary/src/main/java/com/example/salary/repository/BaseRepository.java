package com.example.salary.repository;

import com.example.salary.entity.Salary;

public interface BaseRepository {
  void save(int employeeId, Salary salary);

  Salary get(int employeeId);
}
