package com.vivek.enterpriseResourcePlanningSystem.hr.dto;

import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Employee;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponseDto {

    private Long id;
    @NotBlank
    @Column(nullable = false)
    private String name;

    private String description;

    private List<Employee> employees;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
