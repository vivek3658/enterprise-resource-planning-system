package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxResponseDto;

public interface ProductTaxService extends CrudService<ProductTaxRequestDto, ProductTaxResponseDto,Long> {
}
