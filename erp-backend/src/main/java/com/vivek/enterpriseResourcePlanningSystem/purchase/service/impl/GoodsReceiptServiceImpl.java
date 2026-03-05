package com.vivek.enterpriseResourcePlanningSystem.purchase.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.GoodsReceipt;
import com.vivek.enterpriseResourcePlanningSystem.purchase.mapper.GoodsReceiptMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.repository.GoodsReceiptRepository;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.GoodsReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsReceiptServiceImpl extends AbstractCrudService<GoodsReceipt, GoodsReceiptRequestDto, GoodsReceiptResponseDto,Long> implements GoodsReceiptService {
    private final GoodsReceiptRepository goodsReceiptRepository;
    private final GoodsReceiptMapper goodsReceiptMapper;
    @Override
    protected JpaRepository<GoodsReceipt, Long> repo() {
        return goodsReceiptRepository;
    }

    @Override
    protected BaseMapper<GoodsReceipt, GoodsReceiptRequestDto, GoodsReceiptResponseDto> mapper() {
        return goodsReceiptMapper;
    }
}
