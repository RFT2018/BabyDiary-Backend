package hu.unideb.inf.babydiary.backend.security;

import hu.unideb.inf.babydiary.service.api.domain.User;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Objects;

public class SecurityContextHolderUtil {

    private SecurityContextHolderUtil() {
        super();
    }

    public static long getUserId() {

        return getUser().getId().longValue();
    }

    public static Long getUserIdIfExsistOrReturnNull() {
        if (isNurseNotesUserDetails() && Objects.
                nonNull(getUser()) && Objects.
                nonNull(getUser().getId())) {
            return getUser().getId().longValue();
        } else {
            return null;
        }
    }

    public static User getUser() {
        return ((BabyDiaryUserDetails) SecurityContextHolder
                .getContext().getAuthentication()
                .getPrincipal()).getUser();
    }

    public static boolean isNurseNotesUserDetails() {
        return SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal()
                instanceof BabyDiaryUserDetails;
    }
}
