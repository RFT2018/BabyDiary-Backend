package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.UserEntity;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserToUserEntityListConverter implements Converter<List<User>, List<UserEntity>> {

    @Autowired
    private UserToUserEntityConverter userEntityConverter;

    @Override
    public List<UserEntity> convert(List<User> users) {
        return users.stream().map(user -> userEntityConverter.convert(user)).collect(Collectors.toList());
    }
}
