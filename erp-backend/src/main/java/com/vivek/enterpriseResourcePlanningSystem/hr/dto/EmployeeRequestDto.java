package com.vivek.enterpriseResourcePlanningSystem.hr.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestDto {
    private String name;
    private Long phoneNo;
}
