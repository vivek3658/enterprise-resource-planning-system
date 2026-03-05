package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.UnitOfMeasure;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponseDto {
    private Long id;
    private String product;
    private String skuCode;
    @Enumerated(EnumType.STRING)
    private UnitOfMeasure unitOfMeasure;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
