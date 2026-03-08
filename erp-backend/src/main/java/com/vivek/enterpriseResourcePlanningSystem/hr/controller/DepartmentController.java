package com.vivek.enterpriseResourcePlanningSystem.hr.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.controller.AbstractCrudController;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DepartmentResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hr/department")
public class DepartmentController extends AbstractCrudController<DepartmentRequestDto, DepartmentResponseDto,Long> {

    private final DepartmentService departmentService;
    @Override
    protected CrudService<DepartmentRequestDto, DepartmentResponseDto, Long> service() {
        return departmentService;
    }

}
