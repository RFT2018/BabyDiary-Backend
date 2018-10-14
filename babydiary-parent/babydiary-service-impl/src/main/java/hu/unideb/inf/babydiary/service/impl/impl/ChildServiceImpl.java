package hu.unideb.inf.babydiary.service.impl.impl;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.persistence.repository.ChildRepository;
import hu.unideb.inf.babydiary.service.api.service.ChildService;
import hu.unideb.inf.babydiary.service.impl.converter.ChildEntityToChildListConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ChildServiceImpl implements ChildService {

    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private ChildEntityToChildListConverter childListConverter;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChildService addChild(ChildService child) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChildService updateChild(ChildService child) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteChild(Long id) throws BaseException {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChildService findChildByParent(String lastname) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ChildService findChildById(Long id) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<ChildService> findAllChildren() {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Long countChildren() {
        return null;
    }
}
