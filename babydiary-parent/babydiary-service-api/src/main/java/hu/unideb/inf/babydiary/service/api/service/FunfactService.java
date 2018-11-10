package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.service.api.domain.Album;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FunfactService {

    FunfactService addFunfact(FunfactService funfact) throws BaseException;

    FunfactService updateFunfact(FunfactService funfact) throws BaseException;

    void deleteFunfact(Long id) throws BaseException;

    Album findFunfactById(Long id) throws BaseException;

    List<Album> findAllFunfact();

    Long countFunfacts();

}
