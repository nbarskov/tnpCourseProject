package ru.ssau.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ssau.domain.Company;

@RepositoryRestResource(exported = false)
public interface CompaniesRepository extends CrudRepository<Company, Long> {
}
