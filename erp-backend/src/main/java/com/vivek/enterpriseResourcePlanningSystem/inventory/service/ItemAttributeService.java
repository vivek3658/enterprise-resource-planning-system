package com.vivek.enterpriseResourcePlanningSystem.inventory.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeResponseDto;

public interface ItemAttributeService extends CrudService<ItemAttributeRequestDto, ItemAttributeResponseDto,Long> {
}
