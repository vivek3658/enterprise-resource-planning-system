package com.vivek.enterpriseResourcePlanningSystem.hr.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequestDto {
    @NotBlank
    @Column(nullable = false)
    private String name;

    private String description;
}
