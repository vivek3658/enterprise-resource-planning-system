package com.vivek.enterpriseResourcePlanningSystem.product.service;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BrandService {
    BrandResponseDto create(BrandRequestDto dto);
    BrandResponseDto get(Long id);
    BrandResponseDto update(Long id,BrandRequestDto dto);
    Void delete(Long id);
    Page<BrandResponseDto> getAllBrands(Pageable pageable);
}
