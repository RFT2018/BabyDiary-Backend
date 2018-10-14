package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.WishlistEntity;
import hu.unideb.inf.babydiary.service.api.domain.Wishlist;
import org.springframework.core.convert.converter.Converter;

public class WishlistEntityToWishlistConverter implements Converter<WishlistEntity, Wishlist> {

    @Override
    public Wishlist convert(WishlistEntity wishlistEntity) {
        return null;
    }
}
