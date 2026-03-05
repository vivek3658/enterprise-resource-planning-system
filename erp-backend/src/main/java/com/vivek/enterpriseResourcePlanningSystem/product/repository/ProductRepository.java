package com.vivek.enterpriseResourcePlanningSystem.product.repository;

import com.vivek.enterpriseResourcePlanningSystem.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
