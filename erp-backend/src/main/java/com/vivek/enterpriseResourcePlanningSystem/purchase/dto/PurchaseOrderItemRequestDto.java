package com.vivek.enterpriseResourcePlanningSystem.purchase.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderItemRequestDto {
    private Long purchaseOrder;
    private Long item;
    private Integer quantity;
}
