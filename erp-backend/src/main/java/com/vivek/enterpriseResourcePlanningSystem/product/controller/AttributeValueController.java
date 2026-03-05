package com.vivek.enterpriseResourcePlanningSystem.product.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.service.AttributeValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product/attribute-values")
public class AttributeValueController extends AbstractCrudController<AttributeValueRequestDto, AttributeValueResponseDto,Long> {
    private final AttributeValueService attributeValueService;

    @Override
    protected CrudService<AttributeValueRequestDto, AttributeValueResponseDto, Long> service() {
        return attributeValueService;
    }
}
