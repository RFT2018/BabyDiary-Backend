package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;

import java.util.List;

public interface User {

    User addCustomer(User user) throws BaseException;

    User updateUser(User user) throws BaseException;

    void deleteUser(Long id) throws BaseException;

    User save(User user);

    User findUserByUsername(String username) throws BaseException;

    User findUserByEmail(String email) throws BaseException;

    User findUserById(Long id) throws BaseException;

    List<User> findAllUser();

    List<String> allUsersEmail();

    Long countUsers();

}
