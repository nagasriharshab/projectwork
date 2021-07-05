package com.abc.healthcare.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.healthcare.entity.BillEntity;

public interface BillRepository extends JpaRepository<BillEntity,Integer> {

}
