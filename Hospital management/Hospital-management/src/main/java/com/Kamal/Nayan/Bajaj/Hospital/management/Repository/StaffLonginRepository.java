package com.Kamal.Nayan.Bajaj.Hospital.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Kamal.Nayan.Bajaj.Hospital.management.Entity.StaffLogin;

@Repository
public interface StaffLonginRepository extends JpaRepository<StaffLogin, Long> {

	

}
