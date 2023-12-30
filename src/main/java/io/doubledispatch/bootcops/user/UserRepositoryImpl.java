package io.doubledispatch.bootcops.user;

import java.util.UUID;

import io.doubledispatch.bootcops.orm.jpa.UniqueIdGenerator;

public class UserRepositoryImpl implements UserRepositoryCustom {
    
    private final UniqueIdGenerator<UUID> generator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
        this.generator = generator;
    }

    @Override
    public UserId nextId() {
        return new UserId(generator.getNextUniqueId());
    }

}
