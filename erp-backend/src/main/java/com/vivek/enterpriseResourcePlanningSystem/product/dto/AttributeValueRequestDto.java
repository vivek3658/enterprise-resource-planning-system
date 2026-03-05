package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttributeValueRequestDto {
    private String attribute;
    private String attributeValue;
}
