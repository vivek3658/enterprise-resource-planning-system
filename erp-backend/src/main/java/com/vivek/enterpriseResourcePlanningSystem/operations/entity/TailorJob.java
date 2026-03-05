package com.vivek.enterpriseResourcePlanningSystem.operations.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.inventory.entity.Item;
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
        name = "tailor_jobs"
)
public class TailorJob extends BaseEntity {
    @ManyToOne
    private Tailor tailor;
    @ManyToOne
    private Item item;
}
