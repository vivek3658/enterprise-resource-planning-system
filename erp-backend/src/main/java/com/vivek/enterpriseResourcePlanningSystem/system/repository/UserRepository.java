package com.vivek.enterpriseResourcePlanningSystem.system.repository;

import com.vivek.enterpriseResourcePlanningSystem.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
