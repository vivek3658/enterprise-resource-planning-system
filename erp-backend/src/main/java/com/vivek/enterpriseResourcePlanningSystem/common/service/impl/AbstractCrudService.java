package com.vivek.enterpriseResourcePlanningSystem.common.service.impl;

import com.vivek.enterpriseResourcePlanningSystem.common.mapper.BaseMapper;
import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractCrudService<
        ENTITY,
        REQ,
        RES,
        ID> implements CrudService<REQ, RES, ID> {

    protected abstract JpaRepository<ENTITY, ID> repo();
    protected abstract BaseMapper<ENTITY, REQ, RES> mapper();
    @Override
    @Transactional
    public RES create(REQ request){
        ENTITY entity = mapper().toEntity(request);
        return mapper().toDto(repo().save(entity));

    }
    @Override
    @Transactional
    public RES update(ID id, REQ request){
        ENTITY entity = repo().findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
        repo().delete(entity);
        entity = mapper().toEntity(request);
        return mapper().toDto(repo().save(entity));
    }

    @Override
    public RES get(ID id) {
        return mapper().toDto(
                repo().findById(id)
                        .orElseThrow(() -> new RuntimeException("Not found"))
        );
    }

    @Override
    public Page<RES> getAll(Pageable pageable) {
        return repo().findAll(pageable).map(mapper()::toDto);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        repo().deleteById(id);
    }
}

