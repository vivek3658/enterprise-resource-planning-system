package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequestDto {
    private String name;
    private String description;
    private Long categoryId;
    private Long brandId;
    private BigDecimal price;
    private Integer stock;
}
