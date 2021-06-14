package com.example.salary.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Salary {
  @JsonProperty("grossSalary")
  private int grossSalary;
  @JsonProperty("deductionPercentage")
  private int deductionPercentage;
  @JsonProperty("netSalary")
  private int netSalary;
}
