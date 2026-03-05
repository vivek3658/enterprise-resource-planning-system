package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttributeValueResponseDto{
    private Long id;
    private String attribute;
    private String attributeValue;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
