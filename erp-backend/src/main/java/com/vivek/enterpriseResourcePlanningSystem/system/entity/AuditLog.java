package com.vivek.enterpriseResourcePlanningSystem.system.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "audit_logs"
)
public class AuditLog extends BaseEntity {

    private String action;
    private String entityName;
    private Long entityId;

}
