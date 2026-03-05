package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.Attribute;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.AttributeMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.AttributeRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.AttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttributeServiceImpl extends AbstractCrudService<Attribute, AttributeRequestDto, AttributeResponseDto,Long> implements AttributeService {
    private final AttributeRepository attributeRepository;
    private final AttributeMapper attributeMapper;

    @Override
    protected JpaRepository<Attribute, Long> repo() {
        return attributeRepository;
    }

    @Override
    protected BaseMapper<Attribute, AttributeRequestDto, AttributeResponseDto> mapper() {
        return attributeMapper;
    }
}
