package hu.unideb.inf.babydiary.service.impl.impl;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.commons.pojo.exceptions.ViolationException;
import hu.unideb.inf.babydiary.commons.pojo.request.RegistrationRequest;
import hu.unideb.inf.babydiary.service.api.domain.User;
import hu.unideb.inf.babydiary.service.api.exception.ServiceException;
import hu.unideb.inf.babydiary.service.api.service.RegistrationService;
import hu.unideb.inf.babydiary.service.api.service.UserService;
import hu.unideb.inf.babydiary.service.impl.converter.RegistrationRequestToUserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UserService userService;

    @Autowired
    private RegistrationRequestToUserConverter converter;

    @Override
    public User register(RegistrationRequest registrationRequest) throws ViolationException, ServiceException, BaseException {
        return userService.addUser(converter.convert(registrationRequest));
    }
}
