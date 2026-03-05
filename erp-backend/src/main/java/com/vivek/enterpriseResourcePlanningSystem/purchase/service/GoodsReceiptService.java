package com.vivek.enterpriseResourcePlanningSystem.purchase.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.purchase.dto.GoodsReceiptResponseDto;

public interface GoodsReceiptService extends CrudService<GoodsReceiptRequestDto, GoodsReceiptResponseDto,Long> {
}
