package com.vivek.enterpriseResourcePlanningSystem.hr.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.service.DesignationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hr/designations")
public class DesignationController extends AbstractCrudController<DesignationRequestDto, DesignationResponseDto,Long> {
    private final DesignationService designationService;

    @Override
    protected CrudService<DesignationRequestDto, DesignationResponseDto, Long> service() {
        return designationService;
    }
}
