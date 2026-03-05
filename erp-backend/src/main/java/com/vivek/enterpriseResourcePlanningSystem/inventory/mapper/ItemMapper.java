package com.vivek.enterpriseResourcePlanningSystem.inventory.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.Item;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper extends AbstractBaseMapper<Item, ItemRequestDto, ItemResponseDto> {
    protected ItemMapper(ModelMapper modelMapper) {
        super(modelMapper, Item.class, ItemResponseDto.class);
    }
}
