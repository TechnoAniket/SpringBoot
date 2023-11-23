package com.Kamal.Nayan.Bajaj.Hospital.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kamal.Nayan.Bajaj.Hospital.management.DTO.StaffLoginRequest;
import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.HospitalstaffSignUp;

@Repository
public interface HospitalstaffSignUpRepository extends JpaRepository<HospitalstaffSignUp, Long>{

	void save(StaffLoginRequest loginRequest);

}
