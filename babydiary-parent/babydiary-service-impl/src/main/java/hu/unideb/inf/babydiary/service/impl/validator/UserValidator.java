package hu.unideb.inf.babydiary.service.impl.validator;

import hu.unideb.inf.babydiary.service.api.domain.User;
import hu.unideb.inf.babydiary.service.api.validator.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserValidator extends AbstractValidator<User> {

    @Autowired
    public UserValidator(List<Rule<User>> rules){
        super(rules);
    }

}
