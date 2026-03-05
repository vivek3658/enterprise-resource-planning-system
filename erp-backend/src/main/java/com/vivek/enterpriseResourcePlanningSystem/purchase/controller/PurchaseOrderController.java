package com.vivek.enterpriseResourcePlanningSystem.purchase.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.PurchaseOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/purchase/purchase-orders")
public class PurchaseOrderController extends AbstractCrudController<PurchaseOrderRequestDto, PurchaseOrderResponseDto,Long> {
    private final PurchaseOrderService purchaseOrderService;

    @Override
    protected CrudService<PurchaseOrderRequestDto, PurchaseOrderResponseDto, Long> service() {
        return purchaseOrderService;
    }
}
