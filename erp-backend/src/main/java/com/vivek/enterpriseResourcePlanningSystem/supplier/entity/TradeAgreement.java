package com.vivek.enterpriseResourcePlanningSystem.supplier.entity;

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
        name = "trade_agreements"
)
public class TradeAgreement extends BaseEntity {
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private Item item;

    private Double price;
}
