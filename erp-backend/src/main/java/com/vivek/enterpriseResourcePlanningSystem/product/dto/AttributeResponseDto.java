package com.vivek.enterpriseResourcePlanningSystem.product.dto;

import com.vivek.enterpriseResourcePlanningSystem.common.dto.AbstractResponseDto;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttributeResponseDto extends AbstractResponseDto {

    private String name;
}
