package com.common.aware;

public interface EntityAwareWithParam<T> {
    T toEntity(T t);
}
