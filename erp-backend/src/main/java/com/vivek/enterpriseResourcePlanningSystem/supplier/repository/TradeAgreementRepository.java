package com.vivek.enterpriseResourcePlanningSystem.supplier.repository;

import com.vivek.enterpriseResourcePlanningSystem.supplier.entity.TradeAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeAgreementRepository extends JpaRepository<TradeAgreement, Long> {
}
