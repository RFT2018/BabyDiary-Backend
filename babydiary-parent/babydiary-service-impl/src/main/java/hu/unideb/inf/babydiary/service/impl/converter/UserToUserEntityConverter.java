package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.commons.pojo.enumeration.Sex;
import hu.unideb.inf.babydiary.commons.pojo.enumeration.UserRole;
import hu.unideb.inf.babydiary.persistence.entity.SexEntity;
import hu.unideb.inf.babydiary.persistence.entity.UserEntity;
import hu.unideb.inf.babydiary.persistence.entity.UserRoleEntity;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserToUserEntityConverter implements Converter<User, UserEntity> {

    @Autowired
    private FamilyToFamilyEntityConverter familyEntityConverter;

    public UserEntity convert(User source){
        return UserEntity.builder()
                .id(source.getId())
                .username(source.getUsername())
                .password(source.getPassword())
                .email(source.getEmail())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .family(familyEntityConverter.convert(source.getFamily()))
                .sex(convertSex(source.getSex()))
                .userRole(convertRole(source.getUserRole()))
                .build();
    }

    private SexEntity convertSex(Sex sex) {
        return SexEntity.valueOf(sex.toString());
    }

    private UserRoleEntity convertRole(UserRole role) {
        return UserRoleEntity.valueOf(role.toString());
    }
}
