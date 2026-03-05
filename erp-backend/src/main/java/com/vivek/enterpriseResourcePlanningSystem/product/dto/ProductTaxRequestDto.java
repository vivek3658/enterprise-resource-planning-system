package com.vivek.enterpriseResourcePlanningSystem.product.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductTaxRequestDto {
    private Long product;
    private Long tax;
}
