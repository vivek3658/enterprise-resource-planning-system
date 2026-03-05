package com.vivek.enterpriseResourcePlanningSystem.system.repository;

import com.vivek.enterpriseResourcePlanningSystem.system.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
