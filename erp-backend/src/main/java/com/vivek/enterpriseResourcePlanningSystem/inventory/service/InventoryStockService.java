package com.vivek.enterpriseResourcePlanningSystem.inventory.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockResponseDto;

public interface InventoryStockService extends CrudService<InventoryStockRequestDto, InventoryStockResponseDto,Long> {
}
