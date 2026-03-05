package com.vivek.enterpriseResourcePlanningSystem.inventory.repository;

import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.ItemAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemAttributeRepository extends JpaRepository<ItemAttribute ,Long> {
}
