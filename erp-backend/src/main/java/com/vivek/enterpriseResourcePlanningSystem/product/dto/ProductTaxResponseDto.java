package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductTaxResponseDto {
    private Long id;
    private String product;
    private Double tax;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
