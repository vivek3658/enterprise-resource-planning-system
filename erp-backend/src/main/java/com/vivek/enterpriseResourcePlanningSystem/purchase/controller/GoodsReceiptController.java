package com.vivek.enterpriseResourcePlanningSystem.purchase.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.service.GoodsReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/purchase/goods-receipts")
public class GoodsReceiptController extends AbstractCrudController<GoodsReceiptRequestDto, GoodsReceiptResponseDto,Long> {
    private final GoodsReceiptService goodsReceiptService;

    @Override
    protected CrudService<GoodsReceiptRequestDto, GoodsReceiptResponseDto, Long> service() {
        return goodsReceiptService;
    }
}
