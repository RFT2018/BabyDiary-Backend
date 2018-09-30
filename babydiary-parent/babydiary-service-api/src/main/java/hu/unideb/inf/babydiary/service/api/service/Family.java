package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface Family {

    Family addFamily(Family family) throws BaseException;

    Family updateFamily(Family family) throws BaseException;

    void deleteFamily(Long id) throws BaseException;

    Family findFamilyByLastName(String lastname) throws BaseException;

    Family findFamilyById(Long id) throws BaseException;

    List<Family> findAllFamilies();

    List<String> allFamilyEmail();

    Long countFamilies();

}
