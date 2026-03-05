package com.vivek.enterpriseResourcePlanningSystem.product.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.AttributeValue;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AttributeValueMapper extends AbstractBaseMapper<AttributeValue, AttributeValueRequestDto, AttributeValueResponseDto> {
    protected AttributeValueMapper(ModelMapper modelMapper) {
        super(modelMapper, AttributeValue.class, AttributeValueResponseDto.class);
    }
}
