package com.vivek.enterpriseResourcePlanningSystem.inventory.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.Item;
import com.vivek.enterpriseResourcePlanningSystem.inventory.mapper.ItemMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.repository.ItemRepository;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl extends AbstractCrudService<Item, ItemRequestDto, ItemResponseDto,Long> implements ItemService {
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;
    @Override
    protected JpaRepository<Item, Long> repo() {
        return itemRepository;
    }

    @Override
    protected BaseMapper<Item, ItemRequestDto, ItemResponseDto> mapper() {
        return itemMapper;
    }
}
