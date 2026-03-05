package com.vivek.enterpriseResourcePlanningSystem.purchase.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsReceiptResponseDto {
    private Long id;
    private String purchase;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
