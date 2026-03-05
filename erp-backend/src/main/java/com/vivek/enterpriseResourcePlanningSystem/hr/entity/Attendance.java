package com.vivek.enterpriseResourcePlanningSystem.hr.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "attendance"
)
public class Attendance extends BaseEntity {
    @ManyToOne
    private Employee employee;
    private LocalDate date;
}
