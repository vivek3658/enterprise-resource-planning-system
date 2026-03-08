package com.vivek.enterpriseResourcePlanningSystem.hr.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Department;
import com.vivek.enterpriseResourcePlanningSystem.hr.mapper.DepartmentMapper;
import com.vivek.enterpriseResourcePlanningSystem.hr.repository.DepartmentRepository;
import com.vivek.enterpriseResourcePlanningSystem.hr.service.DepartmentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl extends AbstractCrudService<Department, DepartmentRequestDto, DepartmentResponseDto,Long> implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    private final DepartmentMapper departmentMapper;
    @Override
    protected JpaRepository<Department, Long> repo() {
        return departmentRepository;
    }

    @Override
    protected BaseMapper<Department, DepartmentRequestDto, DepartmentResponseDto> mapper() {
        return departmentMapper;
    }
    @Override
    @Transactional
    public DepartmentResponseDto create(DepartmentRequestDto request){
        Department department = new Department();
        department.setName(request.getName());
        department.setDescription(request.getDescription());
        repo().save(department);
        return departmentMapper.toDto(department);
    }
    @Override
    @Transactional
    public DepartmentResponseDto update(Long id,DepartmentRequestDto request){
        Department department = repo().findById(id).orElseThrow(()->new RuntimeException("department not found with that id."));
        department.setName(request.getName());
        department.setDescription(request.getDescription());
        repo().save(department);
        return departmentMapper.toDto(department);
    }

}
