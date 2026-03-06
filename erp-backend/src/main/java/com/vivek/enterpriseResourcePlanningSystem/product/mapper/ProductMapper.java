package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper
        extends AbstractBaseMapper<Product,ProductRequestDto,ProductResponseDto> {

    protected ProductMapper(ModelMapper modelMapper) {
        super(modelMapper, Product.class, ProductResponseDto.class);
        this.modelMapper.addMappings(new PropertyMap<Product, ProductResponseDto>() {
            @Override
            protected void configure() {
                map().setCategory(source.getCategory().getName());
                map().setBrand(source.getBrand().getName());
            }
        });
    }
}

