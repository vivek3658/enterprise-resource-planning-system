package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.AttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product/attributes")
public class AttributeController extends AbstractCrudController<AttributeRequestDto, AttributeResponseDto,Long> {
    private final AttributeService attributeService;

    @Override
    protected CrudService<AttributeRequestDto, AttributeResponseDto, Long> service() {
        return attributeService;
    }
}
