package hu.unideb.inf.babydiary.backend.security;

import hu.unideb.inf.babydiary.commons.pojo.exceptions.BaseException;
import hu.unideb.inf.babydiary.service.api.domain.User;
import hu.unideb.inf.babydiary.service.api.exception.EntityNotFoundException;
import hu.unideb.inf.babydiary.service.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class BabyDiaryUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user;
        try {
            user = (User) userService.findUserByUsername(username);
        } catch (EntityNotFoundException e) {
            throw new UsernameNotFoundException(e.getMessage(), e);
        } catch (BaseException e) {
            throw new AuthenticationServiceException(
                    "Error on authenticating internal user.", e);
        }
        return new BabyDiaryUserDetails(user);
    }
}