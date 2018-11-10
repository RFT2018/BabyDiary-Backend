package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChildService {

    ChildService addChild(ChildService child) throws BaseException;

    ChildService updateChild(ChildService child) throws BaseException;

    void deleteChild(Long id) throws BaseException;

    ChildService findChildByParent(String lastname) throws BaseException;

    ChildService findChildById(Long id) throws BaseException;

    List<ChildService> findAllChildren();

    Long countChildren();

}
