package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface WishListService {

    WishListService addCustomer(WishListService wishList) throws BaseException;

    WishListService updateCustomer(WishListService wishList) throws BaseException;

    void deleteWishList(Long id) throws BaseException;

    WishListService findWishListById(Long id) throws BaseException;

    List<WishListService> findAllWishList();

    Long countWishLists();

}
