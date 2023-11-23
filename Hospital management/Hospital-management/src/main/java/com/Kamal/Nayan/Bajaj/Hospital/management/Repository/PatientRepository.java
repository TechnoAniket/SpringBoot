package com.Kamal.Nayan.Bajaj.Hospital.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

}
