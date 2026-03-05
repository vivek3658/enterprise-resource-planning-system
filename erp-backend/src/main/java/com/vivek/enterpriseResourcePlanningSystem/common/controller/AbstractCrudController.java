package com.vivek.enterpriseResourcePlanningSystem.common.controller;

import com.vivek.enterpriseResourcePlanningSystem.common.service.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractCrudController<
        REQ,
        RES,
        ID> {

    protected abstract CrudService<REQ, RES, ID> service();

    @PostMapping
    public ResponseEntity<RES> create(@RequestBody REQ req) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service().create(req));
    }

    @PutMapping("/{id}")
    public ResponseEntity<RES> update(
            @PathVariable ID id,
            @RequestBody REQ req) {
        return ResponseEntity.ok(service().update(id, req));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RES> get(@PathVariable ID id) {
        return ResponseEntity.ok(service().get(id));
    }

    @GetMapping
    public ResponseEntity<Page<RES>> getAll(Pageable pageable) {
        return ResponseEntity.ok(service().getAll(pageable));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        service().delete(id);
        return ResponseEntity.noContent().build();
    }
}

