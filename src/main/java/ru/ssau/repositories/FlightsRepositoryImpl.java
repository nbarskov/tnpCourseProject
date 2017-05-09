package ru.ssau.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ssau.domain.Flight;

import javax.transaction.Transactional;

//@Service
//@Transactional
public abstract class FlightsRepositoryImpl implements FlightsRepositoryCustom{
    @Autowired
    private FlightsRepository flightsRepository;

    @Override
    //Обновление билетов
    //public Flight updateTickets(@Param("companyId") long id, @Param("tickets_bought") int tb1, @Param("tickets_available") int tb2){
    public void updateTickets(long id, int tb1, int tb2){
        Flight currentFlight = flightsRepository.findOne((Long)id);

        currentFlight.setTicketsBought(tb1);
        currentFlight.setTicketsAvailable(tb2);

        flightsRepository.save(currentFlight);
    }
}
