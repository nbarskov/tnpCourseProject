package ru.ssau.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "COMPANIES")
@SequenceGenerator(name = "id_sequence", sequenceName = "id_sequence")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    @Column(name = "company_id")
    private Long id;

    @Column(name = "full_name", nullable = false, unique = true, length = 20)
    private String fullName;

    @Column(name = "year_registration", nullable = false)
    private Integer yearOfRegistration;

    @Column(name = "country", nullable = false, length = 50)
    private String country;

    @Column(name = "main_base", nullable = false, length = 50)
    private String mainBase;

    @Column(name = "additional_hub", length = 50)
    private String additionalHub;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private Collection<AirCraft> airCrafts;

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

    public Integer getYearOfRegistration() {
        return yearOfRegistration;
    }

    public void setYearOfRegistration(Integer yearOfRegistration) {
        this.yearOfRegistration = yearOfRegistration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMainBase() {
        return mainBase;
    }

    public void setMainBase(String mainBase) {
        this.mainBase = mainBase;
    }

    public String getAdditionalHub() {
        return additionalHub;
    }

    public void setAdditionalHub(String additionalHub) {
        this.additionalHub = additionalHub;
    }

    public Collection<AirCraft> getAirCrafts() {
        return airCrafts;
    }

    public void setAirCrafts(Collection<AirCraft> airCrafts) {
        this.airCrafts = airCrafts;
    }
}
