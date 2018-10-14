package hu.unideb.inf.babydiary.service.impl.impl;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.persistence.repository.AlbumRepository;
import hu.unideb.inf.babydiary.service.api.domain.Album;
import hu.unideb.inf.babydiary.service.api.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ConversionService conversionService;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Album addAlbum(Album album) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Album updateAlbum(Album album) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void deleteAlbum(Long id) throws BaseException {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Album findAlbumById(Long id) throws BaseException {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<Album> findAllAlbum() {
        return null;
    }
}
