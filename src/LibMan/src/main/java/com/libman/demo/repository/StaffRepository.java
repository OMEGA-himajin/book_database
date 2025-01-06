package com.libman.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libman.demo.model.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

    Optional<Staff> findByUserName(String userName);  // Optional<Staff>を返すように修正
}
