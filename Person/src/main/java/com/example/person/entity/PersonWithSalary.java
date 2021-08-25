package com.example.person.entity;

import com.example.salary.entity.Salary;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class PersonWithSalary {
    private Person person;
    private Salary salary;
}
