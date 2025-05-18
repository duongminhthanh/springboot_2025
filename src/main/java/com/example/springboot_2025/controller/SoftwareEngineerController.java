package com.example.springboot_2025.controller;

import com.example.springboot_2025.entities.SoftwareEngineer;
import com.example.springboot_2025.service.SoftwareEngineerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers/")
@RequiredArgsConstructor
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.findAll();
    }

    @PostMapping
    public void addEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.addEngineer(softwareEngineer);
    }

    @GetMapping("{id}")
    public SoftwareEngineer getEngineer(@PathVariable Integer id) {
        return softwareEngineerService.findEngineerById(id);
    }
}
