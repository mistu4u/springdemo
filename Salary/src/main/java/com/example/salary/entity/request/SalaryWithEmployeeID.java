package com.example.salary.entity.request;

import com.example.salary.entity.Salary;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SalaryWithEmployeeID {
  @JsonProperty("id")
  private int id;
  @JsonProperty("salary")
  private Salary salary;
}
