package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Tax;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.TaxMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.TaxRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.TaxService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaxServiceImpl extends AbstractCrudService<Tax, TaxRequestDto, TaxResponseDto,Long> implements TaxService {
    private TaxRepository taxRepository;
    private TaxMapper taxMapper;
    @Override
    protected JpaRepository<Tax, Long> repo() {
        return taxRepository;
    }

    @Override
    protected BaseMapper<Tax, TaxRequestDto, TaxResponseDto> mapper() {
        return taxMapper;
    }
}
