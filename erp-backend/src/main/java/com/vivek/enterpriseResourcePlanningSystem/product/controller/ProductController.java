package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product/products")
@RequiredArgsConstructor
public class ProductController extends AbstractCrudController<ProductRequestDto, ProductResponseDto, Long> {
    private final ProductService productService;
    @Override
    protected CrudService<ProductRequestDto, ProductResponseDto, Long> service() {
        return productService;
    }
}

