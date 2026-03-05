package com.vivek.enterpriseResourcePlanningSystem.product.repository;

import com.vivek.enterpriseResourcePlanningSystem.product.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category getEntityById(Long id);

}

//    @Query(value = "select * from patient", nativeQuery = true)
//    Page<Patient> findAllPatients(Pageable pageable);
