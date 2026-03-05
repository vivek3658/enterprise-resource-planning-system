package com.vivek.enterpriseResourcePlanningSystem.inventory.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryStockResponseDto {
    private Long id;
    private String item;
    private Integer quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
