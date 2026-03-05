package com.vivek.enterpriseResourcePlanningSystem.inventory.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.ItemAttribute;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ItemAttributeMapper extends AbstractBaseMapper<ItemAttribute, ItemAttributeRequestDto, ItemAttributeResponseDto> {
    protected ItemAttributeMapper(ModelMapper modelMapper) {
        super(modelMapper, ItemAttribute.class, ItemAttributeResponseDto.class);
    }
}
