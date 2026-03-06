package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.enums.TaxType;
import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Tax;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.TaxMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.TaxRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.TaxService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaxServiceImpl extends AbstractCrudService<Tax, TaxRequestDto, TaxResponseDto,Long> implements TaxService {
    private final TaxRepository taxRepository;
    private final TaxMapper taxMapper;
    @Override
    protected JpaRepository<Tax, Long> repo() {
        return taxRepository;
    }

    @Override
    @Transactional
    protected BaseMapper<Tax, TaxRequestDto, TaxResponseDto> mapper() {
        return taxMapper;
    }
    @Override
    @Transactional
    public TaxResponseDto create(TaxRequestDto dto){
        int val = dto.getTaxType().ordinal();
        TaxType type = TaxType.values()[val];
        Tax tax = new Tax();
        tax.setName(dto.getName());
        tax.setRate(dto.getRate());
        tax.setTaxType(type);
        repo().save(tax);

        return taxMapper.toDto(tax);
    }

}
