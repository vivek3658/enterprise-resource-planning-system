package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.UnitOfMeasure;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDto {
    private String product;
    private String skuCode;
    @Enumerated(EnumType.ORDINAL)
    private UnitOfMeasure unitOfMeasure;
}
