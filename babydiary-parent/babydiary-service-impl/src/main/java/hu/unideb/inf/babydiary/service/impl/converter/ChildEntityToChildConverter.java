package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.ChildEntity;
import hu.unideb.inf.babydiary.service.api.domain.Child;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ChildEntityToChildConverter implements Converter<ChildEntity, Child> {

    @Override
    public Child convert(ChildEntity childEntity) {
        return null;
    }
}
