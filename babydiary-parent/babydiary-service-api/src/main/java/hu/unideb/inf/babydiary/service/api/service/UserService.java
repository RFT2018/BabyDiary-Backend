package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.service.api.domain.User;

public interface UserService {

    void addUser(User user);

    User findById(Long id);

    User findByUsername(String username);
}
