package hu.unideb.inf.babydiary.backend.rest;

import hu.unideb.inf.babydiary.backend.security.SecurityContextHolderUtil;
import hu.unideb.inf.babydiary.commons.pojo.response.UserResponse;
import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationRestController {

    @GetMapping("/login")
    @PreAuthorize("isAuthenticated()")
    public UserResponse authorizedUser() {

        User user = SecurityContextHolderUtil.getUser();
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .userRole(user.getUserRole().toString())
                .build();
    }
}
