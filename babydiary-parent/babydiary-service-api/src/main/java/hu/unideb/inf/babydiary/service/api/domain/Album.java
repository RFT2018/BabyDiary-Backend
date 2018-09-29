package hu.unideb.inf.babydiary.service.api.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class Album implements Serializable {

    private Long id;

    private LocalDate date;

    private String name;

    private String size;
    
    private String type;


}
