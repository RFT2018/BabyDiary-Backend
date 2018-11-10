package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.WishlistEntity;
import hu.unideb.inf.babydiary.service.api.domain.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WishlistEntityToWishlistListConverter implements Converter<List<WishlistEntity>, List<Wishlist>> {

    @Autowired
    private WishlistEntityToWishlistConverter wishlistConverter;

    @Override
    public List<Wishlist> convert(List<WishlistEntity> wishlistEntities) {
        return wishlistEntities.stream().map(wishlist -> wishlistConverter.convert(wishlist)).collect(Collectors.toList());
    }
}
