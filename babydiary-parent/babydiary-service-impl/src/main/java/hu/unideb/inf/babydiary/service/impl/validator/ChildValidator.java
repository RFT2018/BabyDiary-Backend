package hu.unideb.inf.babydiary.service.impl.validator;

import hu.unideb.inf.babydiary.service.api.domain.Child;
import hu.unideb.inf.babydiary.service.api.validator.rule.Rule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChildValidator extends AbstractValidator<Child> {

    @Autowired
    public ChildValidator(List<Rule<Child>> rules){
        super(rules);
    }

}
