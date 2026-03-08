package com.vivek.enterpriseResourcePlanningSystem.hr.mapper;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.AbstractBaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Department;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DepartmentMapper extends AbstractBaseMapper<Department, DepartmentRequestDto, DepartmentResponseDto> {
    protected DepartmentMapper(ModelMapper modelMapper) {
        super(modelMapper, Department.class, DepartmentResponseDto.class);

    }
    @Override
    public DepartmentResponseDto toDto(Department department){
        DepartmentResponseDto dto = new DepartmentResponseDto();
        dto.setId(department.getId());
        dto.setName(department.getName());
        dto.setDescription(department.getDescription());
        dto.setEmployees(department.getEmployees());
        dto.setCreatedAt(department.getCreatedAt());
        dto.setUpdatedAt(department.getUpdatedAt());
        return dto;
    }
}
