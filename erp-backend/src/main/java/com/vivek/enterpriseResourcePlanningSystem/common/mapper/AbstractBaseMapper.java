package com.vivek.enterpriseResourcePlanningSystem.common.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import javax.swing.text.html.parser.Entity;

@Component
public abstract class AbstractBaseMapper<E, REQ, RES>
        implements BaseMapper<E, REQ, RES> {

    protected final ModelMapper modelMapper;
    private final Class<E> entityClass;
    private final Class<RES> responseClass;

    protected AbstractBaseMapper(ModelMapper modelMapper,
                                 Class<E> entityClass,
                                 Class<RES> responseClass) {
        this.modelMapper = modelMapper;
        this.entityClass = entityClass;
        this.responseClass = responseClass;
    }

    @Override
    public E toEntity(REQ req) {
        return modelMapper.map(req, entityClass);
    }

    @Override
    public RES toDto(E entity) {
        return modelMapper.map(entity, responseClass);
    }


}


