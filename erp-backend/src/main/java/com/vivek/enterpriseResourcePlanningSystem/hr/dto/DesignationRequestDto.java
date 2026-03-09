package com.vivek.enterpriseResourcePlanningSystem.hr.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DesignationRequestDto {
    @Column(unique = true,nullable = false)
    private String title;
    @NotNull
    @Column(nullable = false)
    private Integer level;
}
