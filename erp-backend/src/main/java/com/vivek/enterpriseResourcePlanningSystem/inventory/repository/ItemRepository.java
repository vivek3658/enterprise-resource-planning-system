package com.vivek.enterpriseResourcePlanningSystem.inventory.repository;

import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
