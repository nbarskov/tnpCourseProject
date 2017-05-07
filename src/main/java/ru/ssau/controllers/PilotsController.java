package ru.ssau.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ssau.domain.Company;
import ru.ssau.repositories.AirCraftsRepository;
import ru.ssau.repositories.CompaniesRepository;

@RestController
@RequestMapping("/aircrafts")
public class AirCraftsController {
    @Autowired
    private AirCraftsRepository aircraftsRepository;

    @GetMapping
    public Iterable<Company> getAll() {
        return aircraftsRepository.findAll();
    }
}
