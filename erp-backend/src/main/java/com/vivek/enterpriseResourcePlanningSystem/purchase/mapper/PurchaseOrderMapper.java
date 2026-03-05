package com.vivek.enterpriseResourcePlanningSystem.purchase.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrder;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PurchaseOrderMapper extends AbstractBaseMapper<PurchaseOrder, PurchaseOrderRequestDto, PurchaseOrderResponseDto> {
    protected PurchaseOrderMapper(ModelMapper modelMapper) {
        super(modelMapper , PurchaseOrder.class,PurchaseOrderResponseDto.class);
    }
}
