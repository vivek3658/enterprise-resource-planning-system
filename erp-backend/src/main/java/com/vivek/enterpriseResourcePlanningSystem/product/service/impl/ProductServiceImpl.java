package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Brand;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Category;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.ProductMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.BrandRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.CategoryRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.ProductRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl extends AbstractCrudService<Product, ProductRequestDto,ProductResponseDto,Long>
        implements ProductService{
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final CategoryRepository categoryRepository;
    private final BrandRepository brandRepository;

    @Override
    protected JpaRepository<Product, Long> repo() {
        return productRepository;
    }

    @Override
    protected BaseMapper<Product, ProductRequestDto, ProductResponseDto> mapper() {
        return productMapper;
    }

    @Override
    public ProductResponseDto create(ProductRequestDto dto) {

        Product product = new Product();

        Category category = categoryRepository
                .findById(dto.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Brand brand = brandRepository.findById(dto.getBrandId())
                .orElseThrow(() -> new RuntimeException("Brand not found"));
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setDescription(dto.getDescription());
        product.setCategory(category);
        product.setBrand(brand);

        return productMapper.toDto(productRepository.save(product));
    }

    @Override
    public ProductResponseDto update(Long id, ProductRequestDto dto) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Update fields from DTO
        existingProduct.setName(dto.getName());
        existingProduct.setDescription(dto.getDescription());
        existingProduct.setPrice(dto.getPrice());
        existingProduct.setStock(dto.getStock());

        if (dto.getCategoryId() != null) {
            Category category = categoryRepository.findById(dto.getCategoryId())
                    .orElseThrow(() -> new RuntimeException("Category not found"));
            existingProduct.setCategory(category);
        }

        if (dto.getBrandId() != null) {
            Brand brand = brandRepository.findById(dto.getBrandId())
                    .orElseThrow(() -> new RuntimeException("Brand not found"));
            existingProduct.setBrand(brand);
        }

        return productMapper.toDto(productRepository.save(existingProduct));
    }
}

