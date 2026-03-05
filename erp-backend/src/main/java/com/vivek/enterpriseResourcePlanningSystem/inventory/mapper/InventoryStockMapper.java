package com.vivek.enterpriseResourcePlanningSystem.inventory.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.InventoryStockResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.InventoryStock;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InventoryStockMapper extends AbstractBaseMapper<InventoryStock, InventoryStockRequestDto, InventoryStockResponseDto> {
    public InventoryStockMapper(ModelMapper modelMapper) {
        super(modelMapper, InventoryStock.class, InventoryStockResponseDto.class);
    }
}
