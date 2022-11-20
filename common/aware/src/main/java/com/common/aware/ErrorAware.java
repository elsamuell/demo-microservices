package com.common.aware;

import lombok.Value;

@Value(staticConstructor = "of")
public class ErrorAware<T> {
    public T message;
}
