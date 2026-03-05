package com.vivek.enterpriseResourcePlanningSystem.purchase.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.PurchaseOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/purchase/purchase-order-items")
public class PurchaseOrderItemController extends AbstractCrudController<PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto,Long> {
    private final PurchaseOrderItemService purchaseOrderItemService;

    @Override
    protected CrudService<PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto, Long> service() {
        return purchaseOrderItemService;
    }
}
