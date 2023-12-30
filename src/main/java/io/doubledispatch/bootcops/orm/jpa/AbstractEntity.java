package io.doubledispatch.bootcops.orm.jpa;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Abstract super class for entities. We are assuming that early primary key
 * generation will be used.
 *
 * @param <T> the type of {@link EntityId} that will be used for this entity
 */
@Getter
@EqualsAndHashCode
@MappedSuperclass
public abstract class AbstractEntity<T extends EntityId<?>> implements Entity<T> {

    @EmbeddedId
    private T id;

    @ArtifactForFramework
    protected AbstractEntity() {
    }

    public AbstractEntity(T id) {
        this.id = Objects.requireNonNull(id);
    }

}