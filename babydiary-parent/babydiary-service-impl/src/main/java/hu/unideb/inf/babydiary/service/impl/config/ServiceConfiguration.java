package hu.unideb.inf.babydiary.service.impl.config;

import hu.unideb.inf.babydiary.persistence.config.PersistenceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistenceConfiguration.class)
@ComponentScan("hu.unideb.inf.babydiary.service.impl")
public class ServiceConfiguration {
}
