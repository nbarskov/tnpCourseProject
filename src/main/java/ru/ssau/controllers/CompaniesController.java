package ru.ssau.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ssau.domain.Company;
import ru.ssau.repositories.CompaniesRepository;

@RestController
@RequestMapping("/companies")
public class CompaniesController {
    @Autowired
    private CompaniesRepository companiesRepository;

    @GetMapping
    public Iterable<Company> getAll() {
        return companiesRepository.findAll();
    }
}
