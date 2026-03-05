package com.vivek.enterpriseResourcePlanningSystem.purchase.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrderItem;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderItemMapper extends AbstractBaseMapper<PurchaseOrderItem, PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto> {
    protected PurchaseOrderItemMapper(ModelMapper modelMapper) {
        super(modelMapper, PurchaseOrderItem.class, PurchaseOrderItemResponseDto.class);
    }
}
