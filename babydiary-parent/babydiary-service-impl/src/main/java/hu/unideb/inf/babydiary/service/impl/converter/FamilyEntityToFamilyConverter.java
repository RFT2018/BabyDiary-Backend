package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.FamilyEntity;
import hu.unideb.inf.babydiary.service.api.domain.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FamilyEntityToFamilyConverter implements Converter<FamilyEntity, Family> {

    @Autowired
    private UserEntityToUserListConverter userListConverter;

    @Autowired
    private ChildEntityToChildListConverter childListConverter;

    @Autowired
    private WishlistEntityToWishlistListConverter wishlistListConverter;

    @Override
    public Family convert(FamilyEntity familyEntity) {
        return Family.builder()
                .id(familyEntity.getId())
                .familyName(familyEntity.getFamilyName())
                .childList(childListConverter.convert(familyEntity.getChildList()))
                .userList(userListConverter.convert(familyEntity.getUserList()))
                .wishLists(wishlistListConverter.convert(familyEntity.getWishLists()))
                .build();
    }
}
