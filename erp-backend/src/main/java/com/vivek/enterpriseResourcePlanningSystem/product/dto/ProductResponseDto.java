package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDto {
    private Long id;
    private String name;
    private String description;
    private String category;
    private String brand;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
