package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductResponseDto;

public interface ProductService extends CrudService<ProductRequestDto, ProductResponseDto, Long>{
}
