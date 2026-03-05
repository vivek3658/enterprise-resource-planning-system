package com.vivek.enterpriseResourcePlanningSystem.system.repository;

import com.vivek.enterpriseResourcePlanningSystem.system.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {
}
