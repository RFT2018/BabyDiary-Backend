package hu.unideb.inf.babydiary.service.impl.validator;

import hu.unideb.inf.babydiary.service.api.domain.Funfact;
import hu.unideb.inf.babydiary.service.api.validator.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FunfactValidator extends AbstractValidator<Funfact> {

    @Autowired
    public FunfactValidator(List<Rule<Funfact>> rules){
        super(rules);
    }
}
