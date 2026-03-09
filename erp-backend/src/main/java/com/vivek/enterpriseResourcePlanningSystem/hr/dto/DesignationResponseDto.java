package com.vivek.enterpriseResourcePlanningSystem.hr.dto;

import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Employee;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DesignationResponseDto {
    @NotNull
    private Long id;

    @Column(unique = true,nullable = false)
    private String title;
    @NotNull
    @Column(nullable = false)
    private Integer level;
    @NotNull
    private List<Employee> employees;
    @NotNull
    private LocalDateTime createdAt;
    @NotNull
    private LocalDateTime updatedAt;
}
