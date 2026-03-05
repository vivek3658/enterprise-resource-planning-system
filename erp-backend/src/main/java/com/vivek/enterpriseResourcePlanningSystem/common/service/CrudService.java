package com.vivek.enterpriseResourcePlanningSystem.common.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudService<REQ, RES, ID> {

    RES create(REQ request);
    RES update(ID id, REQ request);
    RES get(ID id);
    Page<RES> getAll(Pageable pageable);
    void delete(ID id);
}

