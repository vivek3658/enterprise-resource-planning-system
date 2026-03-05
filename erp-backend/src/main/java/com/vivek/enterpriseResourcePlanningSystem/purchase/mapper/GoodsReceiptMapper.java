package com.vivek.enterpriseResourcePlanningSystem.purchase.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.GoodsReceipt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class GoodsReceiptMapper extends AbstractBaseMapper<GoodsReceipt, GoodsReceiptRequestDto, GoodsReceiptResponseDto> {
    protected GoodsReceiptMapper(ModelMapper modelMapper) {
        super(modelMapper, GoodsReceipt.class, GoodsReceiptResponseDto.class);
    }
}
