package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemAttributeResponseDto {
    private Long id;
    private Long item;
    private Long attributeValue;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
