package com.vivek.enterpriseResourcePlanningSystem.purchase.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.PurchaseOrderItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.entity.PurchaseOrderItem;
import com.vivek.enterpriseResourcePlanningSystem.purchase.mapper.PurchaseOrderItemMapper;
import com.vivek.enterpriseResourcePlanningSystem.purchase.repository.PurchaseOrderItemRepository;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.PurchaseOrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseOrderItemServiceImpl extends AbstractCrudService<PurchaseOrderItem, PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto,Long> implements PurchaseOrderItemService {
    private final PurchaseOrderItemRepository purchaseOrderItemRepository;
    private final PurchaseOrderItemMapper purchaseOrderItemMapper;

    @Override
    protected JpaRepository<PurchaseOrderItem, Long> repo() {
        return purchaseOrderItemRepository;
    }

    @Override
    protected BaseMapper<PurchaseOrderItem, PurchaseOrderItemRequestDto, PurchaseOrderItemResponseDto> mapper() {
        return purchaseOrderItemMapper;
    }
}
