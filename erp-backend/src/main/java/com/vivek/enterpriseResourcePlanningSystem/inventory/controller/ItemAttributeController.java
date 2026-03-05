package com.vivek.enterpriseResourcePlanningSystem.inventory.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.ItemAttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory/item-attributes")
public class ItemAttributeController extends AbstractCrudController<ItemAttributeRequestDto, ItemAttributeResponseDto,Long> {
    private final ItemAttributeService itemAttributeService;
    @Override
    protected CrudService<ItemAttributeRequestDto, ItemAttributeResponseDto, Long> service() {
        return itemAttributeService;
    }
}
