package com.vivek.enterpriseResourcePlanningSystem.product.repository;

import com.vivek.enterpriseResourcePlanningSystem.product.entity.AttributeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeValueRepository extends JpaRepository<AttributeValue,Long> {
}
