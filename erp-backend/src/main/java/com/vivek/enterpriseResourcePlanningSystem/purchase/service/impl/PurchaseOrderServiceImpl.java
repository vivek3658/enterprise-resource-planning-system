package com.vivek.enterpriseResourcePlanningSystem.purchase.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrder;
import com.vivek.enterpriseResourcePlanningSystem.purchase.mapper.PurchaseOrderMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.repository.PurchaseOrderRepository;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.PurchaseOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseOrderServiceImpl extends AbstractCrudService<PurchaseOrder, PurchaseOrderRequestDto, PurchaseOrderResponseDto,Long> implements PurchaseOrderService {
    private final PurchaseOrderRepository purchaseOrderRepository;
    private final PurchaseOrderMapper purchaseOrderMapper;
    @Override
    protected JpaRepository<PurchaseOrder, Long> repo() {
        return purchaseOrderRepository;
    }

    @Override
    protected BaseMapper<PurchaseOrder, PurchaseOrderRequestDto, PurchaseOrderResponseDto> mapper() {
        return purchaseOrderMapper;
    }
}
