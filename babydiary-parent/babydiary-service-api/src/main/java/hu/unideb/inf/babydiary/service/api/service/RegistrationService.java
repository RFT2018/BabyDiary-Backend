package hu.unideb.inf.babydiary.service.api.service;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.commons.pojo.exceptions.ViolationException;
import hu.unideb.inf.babydiary.commons.pojo.request.RegistrationRequest;
import hu.unideb.inf.babydiary.service.api.exception.ServiceException;

public interface RegistrationService {

    UserService register(RegistrationRequest registrationRequest) throws ViolationException, ServiceException, BaseException;

   // UserService addManager(ManagerRegistrationRequest managerRegistrationRequest) throws ViolationException, ServiceException, BaseException;

}