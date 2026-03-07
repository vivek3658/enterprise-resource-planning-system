package com.vivek.enterpriseResourcePlanningSystem.system.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.EmployeeStatus;
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
        name = "users"
)
public class User extends BaseEntity {


    private String username;

    private String password;
    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;
}
