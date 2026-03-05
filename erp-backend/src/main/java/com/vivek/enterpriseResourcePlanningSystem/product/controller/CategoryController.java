package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.CategoryResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product/categories")
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping
    public ResponseEntity<CategoryResponseDto> createCategory(@Valid @RequestBody CategoryRequestDto dto){
        CategoryResponseDto response = categoryService.createCategory(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @PutMapping("/{id}")
    public ResponseEntity<CategoryResponseDto> updateCategory(@PathVariable Long id,@Valid @RequestBody CategoryRequestDto dto){
        return ResponseEntity.ok(categoryService.updateCategory(id, dto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseDto> getCategoryById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getCategoryById(id));
    }
    @GetMapping
    public ResponseEntity<Page<CategoryResponseDto>> getAllCategories(Pageable pageable){
        return ResponseEntity.ok(categoryService.getAllCategories(pageable));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id){
        categoryService.deleteCategoryById(id);
        return ResponseEntity.noContent().build();
    }
}
