package hu.unideb.inf.babydiary.service.api.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {

    private Long id;

    private String username;

        private String email;

        private String password;

    private String firstName;

    private String lastName;

    private String sex;

    private String userRole;

    private String family;

}
