package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueResponseDto;



public interface AttributeValueService extends CrudService<AttributeValueRequestDto, AttributeValueResponseDto,Long> {
}
