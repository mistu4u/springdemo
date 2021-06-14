package com.example.salary.service;

import com.example.salary.entity.Salary;
import com.example.salary.entity.request.SalaryWithEmployeeID;
import com.example.salary.repository.SalaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SalaryServiceImpl implements SalaryService {
  private final SalaryRepository salaryRepository;

  @Override
  public Salary getSalary(int empId) {
    return salaryRepository.get(empId);
  }

  @Override
  public void saveSalary(SalaryWithEmployeeID salaryWithEmployeeID) {
    salaryRepository.save(salaryWithEmployeeID.getId(), salaryWithEmployeeID.getSalary());
  }
}
