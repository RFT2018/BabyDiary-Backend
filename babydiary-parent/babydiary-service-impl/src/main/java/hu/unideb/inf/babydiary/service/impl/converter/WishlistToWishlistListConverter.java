package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.WishlistEntity;
import hu.unideb.inf.babydiary.service.api.domain.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WishlistToWishlistListConverter implements Converter<List<Wishlist>, List<WishlistEntity>> {

    @Autowired
    private WishlistToWishlistEntityConverter wishlistEntityConverter;

    @Override
    public List<WishlistEntity> convert(List<Wishlist> wishlists) {
        return wishlists.stream().map(wishlist -> wishlistEntityConverter.convert(wishlist)).collect(Collectors.toList());
    }
}
