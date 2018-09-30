package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface Child {

    Child addChild(Child child) throws BaseException;

    Child updateChild(Child child) throws BaseException;

    void deleteChild(Long id) throws BaseException;

    Child findChildByParent(String lastname) throws BaseException;

    Child findChildById(Long id) throws BaseException;

    List<Child> findAllChildren();

    Long countChildren();

}
