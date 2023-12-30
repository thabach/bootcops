package io.doubledispatch.bootcops.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//@SpringBootTest
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testStoreUser() {
        HashSet<UserRole> roles = new HashSet<>();
        roles.add(UserRole.OFFICER);
        User user = repository.save(
                new User(
                        repository.nextId(),
                        "alex.foley@beverly-hills.com",
                        "my-secret-pwd",
                        roles));
        assertThat(user).isNotNull();
        assertThat(repository.count()).isEqualTo(1L);
    }
}