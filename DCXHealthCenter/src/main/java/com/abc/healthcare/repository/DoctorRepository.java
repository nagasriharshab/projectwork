package com.abc.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.healthcare.entity.DoctorEntity;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
