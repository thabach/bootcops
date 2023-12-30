package io.doubledispatch.bootcops.orm.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
