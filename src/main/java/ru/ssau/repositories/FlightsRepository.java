package ru.ssau.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ssau.domain.Flight;

import java.util.Collection;

@RepositoryRestResource
public interface FlightsRepository extends CrudRepository<Flight, Long> {
    Collection<Flight> findAllByPilot_YearsOfExperienceGreaterThan(@Param("age") int age);
    Collection<Flight> findAllByAirCraft_CompanyId(@Param("companyId") long id);
    Collection<Flight> findAllByPilot_YearsOfExperienceGreaterThanAndAirCraft_CompanyIdEquals(
            @Param("age") int age, @Param("companyId") long id);
}
