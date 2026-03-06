package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.ProductTax;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductTaxMapper extends AbstractBaseMapper<ProductTax, ProductTaxRequestDto, ProductTaxResponseDto> {
    protected ProductTaxMapper(ModelMapper modelMapper) {
        super(modelMapper, ProductTax.class, ProductTaxResponseDto.class);

    }
    @Override
    public ProductTaxResponseDto toDto(ProductTax productTax){
        ProductTaxResponseDto dto = new ProductTaxResponseDto();
        dto.setProduct(productTax.getProduct().getName());
        dto.setTax(productTax.getTax().getRate());
        dto.setId(productTax.getId());
        dto.setCreatedAt(productTax.getCreatedAt());
        dto.setUpdatedAt(productTax.getUpdatedAt());

        return dto;
    }
}
