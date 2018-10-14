package hu.unideb.inf.babydiary.backend.config;

import hu.unideb.inf.babydiary.persistence.config.PersistenceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PersistenceConfiguration.class)
public class Application extends SpringBootServletInitializer {

    public static void main(final String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @Override
    protected final SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
