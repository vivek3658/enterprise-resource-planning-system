package com.vivek.enterpriseResourcePlanningSystem.inventory.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.InventoryStock;
import com.vivek.enterpriseResourcePlanningSystem.inventory.mapper.InventoryStockMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.repository.InventoryStockRepository;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.InventoryStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryStockImpl extends AbstractCrudService<InventoryStock, InventoryStockRequestDto, InventoryStockResponseDto,Long> implements InventoryStockService {
    private final InventoryStockRepository inventoryStockRepository;
    private final InventoryStockMapper inventoryStockMapper;

    @Override
    protected JpaRepository<InventoryStock, Long> repo() {
        return inventoryStockRepository;
    }

    @Override
    protected BaseMapper<InventoryStock, InventoryStockRequestDto, InventoryStockResponseDto> mapper() {
        return inventoryStockMapper;
    }
}
