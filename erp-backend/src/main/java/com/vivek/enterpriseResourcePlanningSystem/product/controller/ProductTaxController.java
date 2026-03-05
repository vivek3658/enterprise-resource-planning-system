package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.ProductTaxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("product/product-taxes")
public class ProductTaxController extends AbstractCrudController<ProductTaxRequestDto, ProductTaxResponseDto,Long> {
    private final ProductTaxService productTaxService;
    @Override
    protected CrudService<ProductTaxRequestDto, ProductTaxResponseDto, Long> service() {
        return productTaxService;
    }
}
