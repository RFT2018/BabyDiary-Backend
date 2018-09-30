package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.service.api.domain.Album;

import java.util.List;

public interface AlbumService {

    Album addAlbum(Album album) throws BaseException;

    Album updateAlbum(Album album) throws BaseException;

    void deleteAlbum(Long id) throws BaseException;

    Album findAlbumById(Long id) throws BaseException;

    List<Album> findAllAlbum();

}
