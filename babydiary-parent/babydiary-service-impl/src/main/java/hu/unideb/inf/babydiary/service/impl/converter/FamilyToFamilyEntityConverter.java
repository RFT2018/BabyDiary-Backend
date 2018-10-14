package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.FamilyEntity;
import hu.unideb.inf.babydiary.service.api.domain.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FamilyToFamilyEntityConverter implements Converter<Family, FamilyEntity> {

    @Autowired
    private UserToUserEntityListConverter userEntityListConverter;

    @Autowired
    private ChildToChildEntityListConverter childEntityListConverter;

    private WishlistToWishlistListConverter wishlistListConverter;

    @Override
    public FamilyEntity convert(Family family) {
        return FamilyEntity.builder()
                .id(family.getId())
                .familyName(family.getFamilyName())
                .childList(childEntityListConverter.convert(family.getChildList()))
                .userList(userEntityListConverter.convert(family.getUserList()))
                .wishLists(wishlistListConverter.convert(family.getWishLists()))
                .build();
    }
}
