package com.example.person.client;

import com.example.salary.entity.Salary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "salary-client", url = "http://localhost:8085/api/v1/salary/")
public interface SalaryClient {
    @GetMapping(value = "{id}")
    public Salary getSalaryById(@PathVariable int id);
}
