package ru.ssau.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.ssau.domain.Flight;

import java.util.Collection;

@RepositoryRestResource
public interface FlightsRepositoryCustom{
    //Flight updateTickets(@Param("companyId") long id, @Param("tickets_bought") int tb1,@Param("tickets_available") int tb2);
    void updateTickets(long id, int tb1, int tb2);
}
