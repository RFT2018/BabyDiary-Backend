package hu.unideb.inf.babydiary.service.impl.validator;

import hu.unideb.inf.babydiary.service.api.domain.Family;
import hu.unideb.inf.babydiary.service.api.validator.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FamilyValidator extends AbstractValidator<Family> {

    @Autowired
    public FamilyValidator(List<Rule<Family>> rules){
        super(rules);
    }

}
