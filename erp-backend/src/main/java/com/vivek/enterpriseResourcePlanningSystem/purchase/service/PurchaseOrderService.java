package com.vivek.enterpriseResourcePlanningSystem.purchase.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderResponseDto;

public interface PurchaseOrderService extends CrudService<PurchaseOrderRequestDto, PurchaseOrderResponseDto,Long> {
}
