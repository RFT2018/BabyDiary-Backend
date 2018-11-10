package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.commons.pojo.request.RegistrationRequest;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RegistrationRequestToUserConverter implements Converter<RegistrationRequest, User> {

    @Override
    public User convert(RegistrationRequest registrationRequest) {
        return User.builder()
                .username(registrationRequest.getUsername())
                .email(registrationRequest.getEmail())
                .password(registrationRequest.password)
                .firstName(registrationRequest.getFirstName())
                .lastName(registrationRequest.getLastName())
                .sex(registrationRequest.getSex())
                .userRole(registrationRequest.getUserRole())
                .build();
    }
}
