package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.ProductTax;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.ProductTaxMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.ProductTaxRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.ProductTaxService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductTaxServiceImpl extends AbstractCrudService<ProductTax, ProductTaxRequestDto, ProductTaxResponseDto,Long> implements ProductTaxService {
    private final ProductTaxRepository productTaxRepository;
    private final ProductTaxMapper productTaxMapper;
    @Override
    protected JpaRepository<ProductTax, Long> repo() {
        return productTaxRepository;
    }

    @Override
    protected BaseMapper<ProductTax, ProductTaxRequestDto, ProductTaxResponseDto> mapper() {
        return productTaxMapper;
    }
}
