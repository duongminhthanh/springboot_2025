package com.example.springboot_2025.service;

import com.example.springboot_2025.entities.SoftwareEngineer;
import com.example.springboot_2025.repository.SoftwareEngineerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public List<SoftwareEngineer> findAll() {
        return softwareEngineerRepository.findAll();
    }

    public void addEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer findEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(
                ()-> new IllegalStateException("Software Engineer Not Found with id: " + id)
        );
    }
}
