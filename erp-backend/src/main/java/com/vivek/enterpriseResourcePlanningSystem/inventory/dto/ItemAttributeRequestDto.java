package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemAttributeRequestDto {
    private Long item;
    private Long attributeValue;
}
