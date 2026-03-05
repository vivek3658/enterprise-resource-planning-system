package com.vivek.enterpriseResourcePlanningSystem.purchase.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemResponseDto;

public interface PurchaseOrderItemService extends CrudService<PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto,Long> {
}
