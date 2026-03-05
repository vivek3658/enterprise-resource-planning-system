package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.TaxType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaxRequestDto {
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private TaxType taxType;
    private Double rate;
}
