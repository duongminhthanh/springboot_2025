package com.example.springboot_2025.repository;

import com.example.springboot_2025.entities.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
}
