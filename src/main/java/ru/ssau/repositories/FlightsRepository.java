package ru.ssau.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ssau.domain.Flight;

@RepositoryRestResource
public interface FlightsRepository extends PagingAndSortingRepository<Flight, Long> {
}
