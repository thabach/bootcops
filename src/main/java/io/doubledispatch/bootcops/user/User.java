package io.doubledispatch.bootcops.user;

import java.util.Set;
import java.util.UUID;
import lombok.Getter;

@Getter
public class User {

    private UUID id;
    private String email;
    private String password;
    private Set<UserRole> roles;

    public User(UUID id, String email, String password, Set<UserRole> roles) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

}