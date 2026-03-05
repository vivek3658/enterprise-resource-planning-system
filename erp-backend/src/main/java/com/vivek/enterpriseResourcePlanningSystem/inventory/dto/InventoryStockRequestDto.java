package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@Getter
@Service
@AllArgsConstructor
@NoArgsConstructor
public class InventoryStockRequestDto {
    private Long item;
    private Integer quantity;
}
