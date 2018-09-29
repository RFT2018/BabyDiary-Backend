package hu.unideb.inf.babydiary.service.api.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class Child implements Serializable {

    private Long id;
    private LocalDate birthday;
        private String firstName;
        private String lastName;
        private String sex;
        private LocalDate conception;
        private int height;
        private int weight;
        private String family;
        private String funfacts;
        private String albums;

}
