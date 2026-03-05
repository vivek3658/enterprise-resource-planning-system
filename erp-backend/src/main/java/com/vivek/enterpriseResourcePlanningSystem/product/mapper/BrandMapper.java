package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Brand;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BrandMapper {
    private final ModelMapper modelMapper;
     public Brand toEntity(BrandRequestDto dto){
         return modelMapper.map(dto,Brand.class);
     }
     public BrandResponseDto toDto(Brand brand){
         return modelMapper.map(brand,BrandResponseDto.class);
     }
}
