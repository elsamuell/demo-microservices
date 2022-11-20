package com.common.aware;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResponseAware <T>{
    T data;

    @JsonCreator
    public ResponseAware(@JsonProperty("data") T data){
        this.data = data;
    };
}
