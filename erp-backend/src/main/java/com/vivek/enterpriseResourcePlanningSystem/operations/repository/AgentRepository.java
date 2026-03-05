package com.vivek.enterpriseResourcePlanningSystem.operations.repository;

import com.vivek.enterpriseResourcePlanningSystem.operations.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
}
