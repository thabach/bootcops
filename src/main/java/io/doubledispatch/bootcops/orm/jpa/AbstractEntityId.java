package io.doubledispatch.bootcops.orm.jpa;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractEntityId<T extends Serializable> implements EntityId<T> {
    
    private T id;

    @ArtifactForFramework
    protected AbstractEntityId() {
    }

    protected AbstractEntityId(T id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public String asString() {
        return id.toString();
    }

}
