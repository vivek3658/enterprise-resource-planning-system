package com.vivek.enterpriseResourcePlanningSystem.inventory.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.product.entity.AttributeValue;
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
        name = "item_attributes"
)
public class ItemAttribute extends BaseEntity {
    @ManyToOne
    private Item item;

    @ManyToOne
    private AttributeValue attributeValue;
}
