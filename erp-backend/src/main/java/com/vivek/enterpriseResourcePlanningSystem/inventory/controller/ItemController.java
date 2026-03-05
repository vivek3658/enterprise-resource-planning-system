package com.vivek.enterpriseResourcePlanningSystem.inventory.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/inventory/items")
public class ItemController extends AbstractCrudController<ItemRequestDto, ItemResponseDto,Long> {
    private final ItemService itemService;
    @Override
    protected CrudService<ItemRequestDto, ItemResponseDto, Long> service() {
        return itemService;
    }
}
