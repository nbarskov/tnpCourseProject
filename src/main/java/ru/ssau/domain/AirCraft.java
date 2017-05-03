package ru.ssau.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "AIRCRAFTS")
public class AirCraft {
    @Id
    @Column(name = "aircraft_id", nullable = false, unique = true, length = 20)
    private String id;

    @Column(name = "model", nullable = false, length = 30)
    private String model;

    @Column(name = "year_issue", nullable = false)
    private Integer yearOfIssue;

    @Column(name = "state", nullable = false, length = 50)
    private String state;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @OneToMany(mappedBy = "airCraft", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private Collection<Flight> flights;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Collection<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Collection<Flight> flights) {
        this.flights = flights;
    }
}
