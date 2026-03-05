package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Category;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.CategoryMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.CategoryRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.CategoryService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    @Transactional
    public CategoryResponseDto createCategory(CategoryRequestDto categoryRequestDto) {
        Category category = categoryMapper.toEntity(categoryRequestDto);
        category.setName(categoryRequestDto.getName());
        return categoryMapper.toDto(categoryRepository.save(category));
    }

    @Override
    @Transactional
    public CategoryResponseDto updateCategory(Long id,CategoryRequestDto categoryRequestDto) {
        Category existing = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        existing.setName(categoryRequestDto.getName());
        return categoryMapper.toDto(categoryRepository.save(existing));
    }

    @Override
    public CategoryResponseDto getCategoryById(Long id) {
        return categoryMapper.toDto(categoryRepository.getEntityById(id));
    }

    @Override
    public Page<CategoryResponseDto> getAllCategories(Pageable pageable) {
        Page<Category> categories = categoryRepository.findAll(pageable);
        return categories.map(categoryMapper::toDto);
    }

    @Override
    @Transactional
    public Void deleteCategoryById(Long id) {
        Category category = categoryRepository.getEntityById(id);
        categoryRepository.delete(category);
        return null;
    }

}
// Page<Patient> patientList = patientRepository.findAllPatients(PageRequest.of(1, 2, Sort.by("name")));
