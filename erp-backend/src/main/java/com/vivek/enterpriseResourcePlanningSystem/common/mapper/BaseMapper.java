package com.vivek.enterpriseResourcePlanningSystem.common.mapper;

public interface BaseMapper<ENTITY, REQ, RES> {

    ENTITY toEntity(REQ req);

    RES toDto(ENTITY entity);

}

