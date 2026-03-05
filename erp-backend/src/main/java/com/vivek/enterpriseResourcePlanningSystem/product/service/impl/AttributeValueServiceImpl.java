package com.vivek.enterpriseResourcePlanningSystem.product.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.product.dto.AttributeValueResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.AttributeValue;
import com.vivek.enterpriseResourcePlanningSystem.product.mapper.AttributeValueMapper;
import com.vivek.enterpriseResourcePlanningSystem.product.repository.AttributeValueRepository;
import com.vivek.enterpriseResourcePlanningSystem.product.service.AttributeValueService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AttributeValueServiceImpl extends AbstractCrudService<AttributeValue, AttributeValueRequestDto, AttributeValueResponseDto,Long> implements AttributeValueService {
    private final AttributeValueRepository attributeValueRepository;
    private final AttributeValueMapper attributeValueMapper;

    @Override
    protected JpaRepository<AttributeValue, Long> repo() {
        return attributeValueRepository;
    }

    @Override
    protected BaseMapper<AttributeValue, AttributeValueRequestDto, AttributeValueResponseDto> mapper() {
        return attributeValueMapper;
    }
}
