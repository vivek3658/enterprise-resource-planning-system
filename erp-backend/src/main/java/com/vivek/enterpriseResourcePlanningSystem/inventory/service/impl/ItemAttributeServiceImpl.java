package com.vivek.enterpriseResourcePlanningSystem.inventory.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.dto.ItemAttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.ItemAttribute;
import com.vivek.enterpriseResourcePlanningSystem.inventory.mapper.ItemAttributeMapper;
import com.vivek.enterpriseResourcePlanningSystem.inventory.repository.ItemAttributeRepository;
import com.vivek.enterpriseResourcePlanningSystem.inventory.service.ItemAttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemAttributeServiceImpl extends AbstractCrudService<ItemAttribute, ItemAttributeRequestDto, ItemAttributeResponseDto,Long> implements ItemAttributeService {
    private final ItemAttributeRepository itemAttributeRepository;
    private final ItemAttributeMapper itemAttributeMapper;
    @Override
    protected JpaRepository<ItemAttribute, Long> repo() {
        return itemAttributeRepository;
    }

    @Override
    protected BaseMapper<ItemAttribute, ItemAttributeRequestDto, ItemAttributeResponseDto> mapper() {
        return itemAttributeMapper;
    }
}
