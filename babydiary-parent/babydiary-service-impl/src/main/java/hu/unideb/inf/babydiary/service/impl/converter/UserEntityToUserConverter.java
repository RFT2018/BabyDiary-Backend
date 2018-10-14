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
public class UserEntityToUserConverter implements Converter<UserEntity, User> {

    @Autowired
    private FamilyEntityToFamilyConverter familyConverter;

        @Override
        public User convert(UserEntity source){
            return User.builder()
                    .id(source.getId())
                    .username(source.getUsername())
                    .password(source.getPassword())
                    .email(source.getEmail())
                    .firstName(source.getFirstName())
                    .lastName(source.getLastName())
                    .userRole(convertRole(source.getUserRole()))
                    .sex(convertSex(source.getSex()))
                    .family(familyConverter.convert(source.getFamily()))
                    .build();
        }

        private UserRole convertRole(UserRoleEntity role) {
            return UserRole.valueOf(role.toString());
        }

        private Sex convertSex(SexEntity sex) {
            return Sex.valueOf(sex.toString());
        }
}
