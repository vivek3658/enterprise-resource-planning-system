package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxResponseDto;

public interface TaxService extends CrudService<TaxRequestDto, TaxResponseDto, Long> {
    TaxResponseDto create(TaxRequestDto dto);
}
