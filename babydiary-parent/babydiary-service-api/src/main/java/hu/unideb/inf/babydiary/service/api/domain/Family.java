package hu.unideb.inf.babydiary.service.api.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class Family implements Serializable {

    private Long id;

    private String familyName;

    private List<User> userList;

    private List<Child> childList;

    private List<Wishlist> wishLists;

}
