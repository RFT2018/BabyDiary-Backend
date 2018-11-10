package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User addUser(User user) throws BaseException;

    User findUserByUsername(String username) throws BaseException;
}
