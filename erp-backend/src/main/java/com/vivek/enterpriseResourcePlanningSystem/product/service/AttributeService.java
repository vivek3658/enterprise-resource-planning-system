package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeResponseDto;

public interface AttributeService extends CrudService<AttributeRequestDto, AttributeResponseDto,Long> {
}
