package com.vivek.enterpriseResourcePlanningSystem.supplier.entity;


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
        name = "supplier_addresses"
)
public class SupplierAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Supplier supplier;
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String country;

    private Long postalCode;

    private Boolean isDefault;
}
