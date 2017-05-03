package ru.ssau.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Table(name = "PILOTS")
@SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence")
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @Column(name = "pilot_id")
    private Long id;

    @Column(name = "full_name", nullable = false, length = 70)
    private String fullName;

    @Column(name = "dob", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "years_exp", nullable = false)
    private Integer yearsOfExperience;

    @Column(name = "nationality", nullable = false, length = 3)
    private String nationality;

    @OneToMany(mappedBy = "pilot", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private Collection<Flight> flights;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Collection<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Collection<Flight> flights) {
        this.flights = flights;
    }
}
