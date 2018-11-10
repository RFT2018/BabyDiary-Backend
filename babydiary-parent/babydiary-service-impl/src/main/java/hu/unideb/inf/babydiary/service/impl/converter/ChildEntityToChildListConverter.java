package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.ChildEntity;
import hu.unideb.inf.babydiary.service.api.domain.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChildEntityToChildListConverter implements Converter<List<ChildEntity>, List<Child>> {

    @Autowired
    private ChildEntityToChildConverter childConverter;

    @Override
    public List<Child> convert(List<ChildEntity> childEntities) {
        return childEntities.stream().map(child -> childConverter.convert(child)).collect(Collectors.toList());
    }
}
