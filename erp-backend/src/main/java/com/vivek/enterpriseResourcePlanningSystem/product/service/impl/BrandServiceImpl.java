package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Brand;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.BrandMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.BrandRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.BrandService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    @Override
    @Transactional
    public BrandResponseDto create( BrandRequestDto dto) {
        Brand brand = brandMapper.toEntity(dto);
//        if(brandRepository.findByName(brand.getName()).equals(brand.getName())){
//            return null;
//        }
        brand.setName(dto.getName());
        return brandMapper.toDto(brandRepository.save(brand));
    }

    @Override
    public BrandResponseDto get(Long id) {
        Brand brand = brandRepository.findById(id).orElseThrow(()-> new RuntimeException("Brand Not Found"));
        return brandMapper.toDto(brand);

    }

    @Override
    @Transactional
    public BrandResponseDto update(Long id, BrandRequestDto dto) {
        Brand brand = brandRepository.findById(id).orElseThrow(()-> new RuntimeException("Brand Not Found"));
        brand.setName(dto.getName());
        return brandMapper.toDto(brandRepository.save(brand));
    }

    @Override
    @Transactional
    public Void delete(Long id) {
        Brand brand = brandRepository.findById(id).orElseThrow(()->new RuntimeException("Brand not found"));
        brandRepository.delete(brand);
        return null;
    }

    @Override
    public Page<BrandResponseDto> getAllBrands(Pageable pageable) {
        Page<Brand> brands = brandRepository.findAll(pageable);
        return brands.map(brandMapper::toDto);
    }
}
