package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Tax;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TaxMapper extends AbstractBaseMapper<Tax, TaxRequestDto, TaxResponseDto> {
    protected TaxMapper(ModelMapper modelMapper) {
        super(modelMapper, Tax.class, TaxResponseDto.class);
    }
}
