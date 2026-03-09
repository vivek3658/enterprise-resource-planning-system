package com.vivek.enterpriseResourcePlanningSystem.hr.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Designation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DesignationMapper extends AbstractBaseMapper<Designation, DesignationRequestDto, DesignationResponseDto> {
    protected DesignationMapper(ModelMapper modelMapper) {
        super(modelMapper, Designation.class, DesignationResponseDto.class);
    }
    @Override
    public DesignationResponseDto toDto(Designation designation){
        DesignationResponseDto dto = new DesignationResponseDto();
        dto.setId(designation.getId());
        dto.setTitle(designation.getTitle());
        dto.setLevel(designation.getLevel());
        dto.setEmployees(designation.getEmployee());
        dto.setCreatedAt(designation.getCreatedAt());
        dto.setUpdatedAt(designation.getUpdatedAt());
        return dto;
    }
}
