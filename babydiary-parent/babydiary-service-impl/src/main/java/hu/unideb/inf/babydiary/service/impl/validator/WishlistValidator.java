package hu.unideb.inf.babydiary.service.impl.validator;

import hu.unideb.inf.babydiary.service.api.domain.Wishlist;
import hu.unideb.inf.babydiary.service.api.validator.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WishlistValidator extends AbstractValidator<Wishlist> {

    @Autowired
    public  WishlistValidator(List<Rule<Wishlist>> rules){

        super(rules);

    }

}
