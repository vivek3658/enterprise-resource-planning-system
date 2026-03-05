package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Attribute;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AttributeMapper extends AbstractBaseMapper<Attribute, AttributeRequestDto, AttributeResponseDto> {
    protected AttributeMapper(ModelMapper modelMapper) {
        super(modelMapper, Attribute.class, AttributeResponseDto.class);
    }
}
