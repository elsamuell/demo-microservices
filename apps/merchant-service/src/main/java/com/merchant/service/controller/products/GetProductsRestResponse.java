package com.merchant.service.controller.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class GetProductsRestResponse {
    @JsonProperty("id")
    Long id;
    @JsonProperty("productName")
    String productName;
    @JsonProperty("price")
    Double price;
    @JsonProperty("qty")
    Integer qty;
}
