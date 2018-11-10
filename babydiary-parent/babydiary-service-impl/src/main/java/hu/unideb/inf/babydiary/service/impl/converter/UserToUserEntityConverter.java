package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.UserEntity;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserEntityConverter implements Converter<User, UserEntity> {

    @Override
    public UserEntity convert(User source){
        return UserEntity.builder()
                .id(source.getId())
                .username(source.getUsername())
                .password(source.getPassword())
                .email(source.getEmail())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .sex(source.getSex())
                .userRole(source.getUserRole())
                .build();
    }

}
