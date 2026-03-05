package com.vivek.enterpriseResourcePlanningSystem.product.repository;

import com.vivek.enterpriseResourcePlanningSystem.product.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
    String findByName(String name);
}
