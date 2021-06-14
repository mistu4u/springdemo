package com.example.salary.service;

import com.example.salary.entity.Salary;
import com.example.salary.entity.request.SalaryWithEmployeeID;

public interface SalaryService {
  Salary getSalary(int empId);

  void saveSalary(SalaryWithEmployeeID salaryWithEmployeeID);
}
