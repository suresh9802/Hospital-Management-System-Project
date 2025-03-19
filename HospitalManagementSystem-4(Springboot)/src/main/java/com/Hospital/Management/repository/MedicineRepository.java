package com.Hospital.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Management.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
