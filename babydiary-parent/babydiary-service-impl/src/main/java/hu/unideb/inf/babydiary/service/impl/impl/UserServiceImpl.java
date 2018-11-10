package hu.unideb.inf.babydiary.service.impl.impl;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.persistence.repository.UserRepository;
import hu.unideb.inf.babydiary.service.api.domain.User;
import hu.unideb.inf.babydiary.service.api.service.UserService;
import hu.unideb.inf.babydiary.service.impl.converter.UserEntityToUserConverter;
import hu.unideb.inf.babydiary.service.impl.converter.UserToUserEntityConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserToUserEntityConverter toEntity;
    private final UserEntityToUserConverter toUser;
    private final UserRepository userRepository;

    @Override
    public User addUser(User user) throws BaseException {

        return toUser.convert(userRepository.save(Objects.requireNonNull(toEntity.convert(user))));
    }

    @Override
    public User findUserByUsername(String username) throws BaseException {
        return null;
    }
}
