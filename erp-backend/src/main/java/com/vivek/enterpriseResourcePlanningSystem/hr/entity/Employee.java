package com.vivek.enterpriseResourcePlanningSystem.hr.entity;

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
        name = "employees"
)
public class Employee extends BaseEntity {


    private String name;

    private Long phoneNo;
}
