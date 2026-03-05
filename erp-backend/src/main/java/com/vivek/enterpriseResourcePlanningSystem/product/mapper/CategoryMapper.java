package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Category;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryMapper {
    private final ModelMapper modelMapper;

    public Category toEntity(CategoryRequestDto categoryRequestDto){
        return modelMapper.map(categoryRequestDto, Category.class);
    }
    public CategoryResponseDto toDto(Category category){
        return modelMapper.map(category, CategoryResponseDto.class);
    }
}
