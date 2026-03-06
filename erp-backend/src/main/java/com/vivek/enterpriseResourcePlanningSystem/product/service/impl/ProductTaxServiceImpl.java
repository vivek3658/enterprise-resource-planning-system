package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.ProductTaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.ProductTax;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Tax;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.ProductTaxMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.ProductRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.ProductTaxRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.TaxRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.ProductTaxService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductTaxServiceImpl extends AbstractCrudService<ProductTax, ProductTaxRequestDto, ProductTaxResponseDto,Long> implements ProductTaxService {
    private final ProductTaxRepository productTaxRepository;
    private final ProductTaxMapper productTaxMapper;
    private final ProductRepository productRepository;
    private final TaxRepository taxRepository;

    @Override
    protected JpaRepository<ProductTax, Long> repo() {
        return productTaxRepository;
    }

    @Override
    protected BaseMapper<ProductTax, ProductTaxRequestDto, ProductTaxResponseDto> mapper() {
        return productTaxMapper;
    }
    @Override
    @Transactional
    public ProductTaxResponseDto create(ProductTaxRequestDto dto){
        ProductTax productTax = new ProductTax();
        Product product = productRepository.findById(dto.getProduct()).orElseThrow(()-> new RuntimeException("Product Not found"));
        Tax tax = taxRepository.findById(dto.getTax()).orElseThrow(()->new RuntimeException("Tax Not Found"));
        productTax.setTax(tax);
        productTax.setProduct(product);
        productTaxRepository.save(productTax);
        return productTaxMapper.toDto(productTax);

    }

    @Override
    @Transactional
    public ProductTaxResponseDto update(Long id, ProductTaxRequestDto dto) {
        ProductTax productTax = productTaxRepository.findById(id).orElseThrow(()->new RuntimeException("Product Tax Not Found"));
        Product product = productRepository.findById(dto.getProduct()).orElseThrow(()->new RuntimeException("Product Not Found"));
        Tax tax = taxRepository.findById(dto.getTax()).orElseThrow(()->new RuntimeException("Tax Not Found"));
        productTax.setProduct(product);
        productTax.setTax(tax);
        ProductTax saved = productTaxRepository.save(productTax);
        return productTaxMapper.toDto(saved);
    }
}
