package com.product.persistence.merchant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MerchantEntity {

    Long id;
    String merchantName;

    @JsonCreator
    public MerchantEntity(
            @JsonProperty("id")
            Long id,
            @JsonProperty("merchantName")
            String merchantName
    ){
        this.id = id;
        this.merchantName = merchantName;
    }
}
