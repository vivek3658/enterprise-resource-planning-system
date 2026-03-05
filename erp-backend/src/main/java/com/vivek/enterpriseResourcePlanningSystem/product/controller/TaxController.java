package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.TaxResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.TaxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("product/taxes")
public class TaxController extends AbstractCrudController<TaxRequestDto, TaxResponseDto, Long> {
    private TaxService taxService;
    @Override
    protected CrudService<TaxRequestDto, TaxResponseDto, Long> service() {
        return taxService;
    }
}
