package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequestDto {
    @Column(nullable = false)
    private String name;
}
