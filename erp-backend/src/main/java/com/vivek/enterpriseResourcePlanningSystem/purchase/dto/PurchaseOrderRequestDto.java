package com.vivek.enterpriseResourcePlanningSystem.purchase.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.OrderStatus;
import com.vivek.enterpriseResourcePlanningSystem.supplier.entity.Supplier;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseOrderRequestDto {
    private Supplier supplier;
    @Enumerated(EnumType.ORDINAL)
    private OrderStatus orderStatus;
}
