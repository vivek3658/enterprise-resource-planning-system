package com.vivek.enterpriseResourcePlanningSystem.hr.service;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationRequestDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.dto.DesignationResponseDto;
import com.vivek.enterpriseResourcePlanningSystem.hr.entity.Designation;


public interface DesignationService extends CrudService<DesignationRequestDto, DesignationResponseDto, Long> {
}
