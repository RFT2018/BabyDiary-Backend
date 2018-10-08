package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface FamilyService {

    FamilyService addFamily(FamilyService family) throws BaseException;

    FamilyService updateFamily(FamilyService family) throws BaseException;

    void deleteFamily(Long id) throws BaseException;

    FamilyService findFamilyByLastName(String lastname) throws BaseException;

    FamilyService findFamilyById(Long id) throws BaseException;

    List<FamilyService> findAllFamilies();

    List<String> allFamilyEmail();

    Long countFamilies();

}
