package hu.unideb.inf.babydiary.service.impl.impl;

import hu.unideb.inf.babydiary.persistence.entity.UserEntity;
import hu.unideb.inf.babydiary.persistence.repository.UserRepository;
import hu.unideb.inf.babydiary.service.api.domain.User;
import hu.unideb.inf.babydiary.service.api.service.UserService;
import hu.unideb.inf.babydiary.service.impl.converter.user.UserEntityToUserConverter;
import hu.unideb.inf.babydiary.service.impl.converter.user.UserToUserEntityConverter;
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
    public void addUser(User user){

        toUser.convert(userRepository.save(Objects.requireNonNull(toEntity.convert(user))));
    }

    @Override
    public User findById(Long id) {
        UserEntity userEntity = userRepository.getOne(id);
        return toUser.convert(userEntity);
    }

    @Override
    public User findByUsername(String username) {
        UserEntity userEntity = userRepository.findByUsername(username);
        return toUser.convert(userEntity);
    }
}
