package com.vivek.enterpriseResourcePlanningSystem.sales.entity;

import com.vivek.enterpriseResourcePlanningSystem.common.entity.BaseEntity;
import com.vivek.enterpriseResourcePlanningSystem.common.enums.AddressType;
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
        name = "customer_addresses"
)
public class CustomerAddress extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private AddressType addressType;
    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String country;

    private Long postalCode;

    @ManyToOne
    private Customer customer;
}
