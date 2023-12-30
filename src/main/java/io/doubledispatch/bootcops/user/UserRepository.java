package io.doubledispatch.bootcops.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom {

}
