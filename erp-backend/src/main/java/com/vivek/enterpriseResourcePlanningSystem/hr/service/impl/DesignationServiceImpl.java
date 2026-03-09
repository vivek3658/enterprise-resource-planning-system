package com.vivek.enterpriseResourcePlanningSystem.hr.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.impl.AbstractCrudService;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Designation;
import com.vivek.enterpriseResourcePlanningSystem.hr.mapper.DesignationMapper;
import com.vivek.enterpriseResourcePlanningSystem.hr.repository.DesignationRepository;
import com.vivek.enterpriseResourcePlanningSystem.hr.service.DesignationService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesignationServiceImpl extends AbstractCrudService<Designation, DesignationRequestDto, DesignationResponseDto,Long> implements DesignationService {
    private final DesignationRepository designationRepository;
    private final DesignationMapper designationMapper;
    @Override
    protected JpaRepository<Designation, Long> repo() {
        return designationRepository;
    }

    @Override
    protected BaseMapper<Designation, DesignationRequestDto, DesignationResponseDto> mapper() {
        return designationMapper;
    }
    @Override
    @Transactional
    public DesignationResponseDto create(DesignationRequestDto dto){
        if(dto.getTitle().trim().equals(" ")){
           throw new RuntimeException("Designation title can't be empty");
        }
        if(dto.getLevel() < 0 || dto.getLevel() > 10) throw new RuntimeException("Level can't be negative or more than 10");
        Designation designation = new Designation();
        designation.setTitle(dto.getTitle());
        designation.setLevel(dto.getLevel());
        repo().save(designation);
        return mapper().toDto(designation);
    }
    @Override
    @Transactional
    public DesignationResponseDto update(Long id,DesignationRequestDto request){
        Designation designation = repo().findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
        if(request.getTitle().trim().equals(" ")){
            throw new RuntimeException("Designation title can't be empty");
        }
        if(request.getLevel() < 0 || request.getLevel() > 10) throw new RuntimeException("Level can't be negative or more than 10");
        designation.setTitle(request.getTitle());
        designation.setLevel(request.getLevel());
        repo().save(designation);
        return mapper().toDto(designation);
    }
}
