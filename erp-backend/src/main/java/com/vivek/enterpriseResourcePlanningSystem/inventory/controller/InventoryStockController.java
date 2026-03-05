package com.vivek.enterpriseResourcePlanningSystem.inventory.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.InventoryStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory/inventory-stocks")
public class InventoryStockController extends AbstractCrudController<InventoryStockRequestDto, InventoryStockResponseDto,Long> {
    private final InventoryStockService inventoryStockService;

    @Override
    protected CrudService<InventoryStockRequestDto, InventoryStockResponseDto, Long> service() {
        return inventoryStockService;
    }
}
