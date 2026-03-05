package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.TaxType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaxResponseDto {
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private TaxType taxType;
    private Double rate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
