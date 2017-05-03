package ru.ssau.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import ru.ssau.domain.AirCraft;
import ru.ssau.domain.Company;
import ru.ssau.domain.Flight;
import ru.ssau.domain.Pilot;

@Configuration
public class RestRepositoriesConfiguration extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Pilot.class, AirCraft.class, Company.class, Flight.class);
    }
}
