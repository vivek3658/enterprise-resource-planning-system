package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    //create Category
    CategoryResponseDto createCategory(CategoryRequestDto categoryRequestDto);
    CategoryResponseDto updateCategory(Long id,CategoryRequestDto categoryRequestDto);
    CategoryResponseDto getCategoryById(Long id);
    Page<CategoryResponseDto> getAllCategories(Pageable pageable);
    Void deleteCategoryById(Long id);
}
