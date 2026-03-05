package com.vivek.enterpriseResourcePlanningSystem.purchase.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.OrderStatus;
import com.vivek.enterpriseResourcePlanningSystem.supplier.entity.Supplier;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderResponseDto{
    private Long id;
    private Supplier supplier;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
