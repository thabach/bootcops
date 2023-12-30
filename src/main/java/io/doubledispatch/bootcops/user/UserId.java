package io.doubledispatch.bootcops.user;

import java.util.UUID;

import io.doubledispatch.bootcops.orm.jpa.AbstractEntityId;
import io.doubledispatch.bootcops.orm.jpa.ArtifactForFramework;

public final class UserId extends AbstractEntityId<UUID> {

    @ArtifactForFramework
    protected UserId() {
    }

    public UserId(UUID id) {
        super(id);
    }

}
