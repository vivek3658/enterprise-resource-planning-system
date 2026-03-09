package com.vivek.enterpriseResourcePlanningSystem.hr.entity;


import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "designations",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_title",columnNames = "title")
        }
)
public class Designation extends BaseEntity {
    @Column(unique = true,nullable = false)
    private String title;
    @NotNull
    @Column(nullable = false)
    private Integer level;
    @OneToMany
    @Column(nullable = false)
    private List<Employee> employee = new ArrayList<>();

}
