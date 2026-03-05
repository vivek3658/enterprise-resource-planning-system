package com.vivek.enterpriseResourcePlanningSystem.purchase.entity;

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
        name = "goods_receipt_items"
)
public class GoodsReceiptItem extends BaseEntity {
    @ManyToOne
    private GoodsReceipt goodsReceipt;
    @ManyToOne
    private Item item;
}
