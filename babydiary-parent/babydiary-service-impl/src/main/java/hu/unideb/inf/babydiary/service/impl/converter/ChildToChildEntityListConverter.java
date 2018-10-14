package hu.unideb.inf.babydiary.service.impl.converter;

import hu.unideb.inf.babydiary.persistence.entity.ChildEntity;
import hu.unideb.inf.babydiary.service.api.domain.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ChildToChildEntityListConverter implements Converter<List<Child>, List<ChildEntity>> {

    @Autowired
    private ChildToChildEntityConverter childEntityConverter;

    @Override
    public List<ChildEntity> convert(List<Child> children) {
        return children.stream().map(child -> childEntityConverter.convert(child)).collect(Collectors.toList());
    }
}
