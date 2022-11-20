package com.merchant.persistence.product;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductEntity {

    Long id;
    Long merchantId;
    String productName;
    Double price;
    Integer qty;

    @JsonCreator
    public ProductEntity(
            @JsonProperty("id")
            Long id,
            @JsonProperty("merchantId")
            Long merchantId,
            @JsonProperty("productName")
            String productName,
            @JsonProperty("price")
            Double price,
            @JsonProperty("qty")
            Integer qty
    ){
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.merchantId = merchantId;
        this.price = price;
    }
}
