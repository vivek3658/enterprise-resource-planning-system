package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper
        extends AbstractBaseMapper<Product,ProductRequestDto,ProductResponseDto> {

    protected ProductMapper(ModelMapper modelMapper) {
        super(modelMapper, Product.class, ProductResponseDto.class);
    }
}

