package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.BrandResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.BrandService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product/brands")
public class BrandController {

    private final BrandService brandService;

    @PostMapping
    public ResponseEntity<BrandResponseDto> createBrand(@Valid @RequestBody BrandRequestDto dto){
        BrandResponseDto responseDto= brandService.create(dto);
//        if(responseDto == null){
//            ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Brand Already Exists.");
//        }
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<BrandResponseDto> findBrandById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(brandService.get(id));
    }
    @GetMapping
    public ResponseEntity<Page<BrandResponseDto>> findAllBrands(Pageable pageable){

        return ResponseEntity.ok(brandService.getAllBrands(pageable));
    }
    @PutMapping("/{id}")
    public ResponseEntity<BrandResponseDto> updateBrand(@PathVariable Long id,@Valid @RequestBody BrandRequestDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(brandService.update(id,dto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<BrandResponseDto> deleteBrand(@PathVariable Long id){
        brandService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
