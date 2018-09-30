package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.service.api.domain.Album;

import java.util.List;

public interface Funfact {

    Funfact addFunfact(Funfact funfact) throws BaseException;

    Funfact updateFunfact(Funfact funfact) throws BaseException;

    void deleteFunfact(Long id) throws BaseException;

    Album findFunfactById(Long id) throws BaseException;

    List<Album> findAllFunfact();

    Long countFunfacts();

}
