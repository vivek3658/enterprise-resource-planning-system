package com.vivek.enterpriseResourcePlanningSystem.purchase.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderItemResponseDto {
    private Long id;
    private String purchaseOrder;
    private String item;

    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
