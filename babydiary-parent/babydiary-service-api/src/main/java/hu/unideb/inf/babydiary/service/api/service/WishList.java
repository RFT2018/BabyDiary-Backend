package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface WishList {

    WishList addCustomer(WishList wishList) throws BaseException;

    WishList updateCustomer(WishList wishList) throws BaseException;

    void deleteWishList(Long id) throws BaseException;

    WishList findWishListById(Long id) throws BaseException;

    List<WishList> findAllWishList();

    Long countWishLists();

}
