package com.vivek.enterpriseResourcePlanningSystem.hr.entity;


import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "departments"
)
public class Department extends BaseEntity {
    @NotBlank
    @Column(nullable = false)
    private String name;

    private String description;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Employee> employees = new ArrayList<>();
}
