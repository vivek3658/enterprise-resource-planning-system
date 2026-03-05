package com.vivek.enterpriseResourcePlanningSystem.inventory.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemResponseDto;

public interface ItemService extends CrudService<ItemRequestDto, ItemResponseDto,Long> {
}
