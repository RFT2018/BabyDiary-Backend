package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface UserService {

    UserService addCustomer(UserService user) throws BaseException;

    UserService updateUser(UserService user) throws BaseException;

    void deleteUser(Long id) throws BaseException;

    UserService save(UserService user);

    UserService findUserByUsername(String username) throws BaseException;

    UserService findUserByEmail(String email) throws BaseException;

    UserService findUserById(Long id) throws BaseException;

    List<UserService> findAllUser();

    List<String> allUsersEmail();

    Long countUsers();

}
