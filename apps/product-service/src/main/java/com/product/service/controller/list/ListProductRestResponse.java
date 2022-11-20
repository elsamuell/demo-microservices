package com.product.service.controller.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class ListProductRestResponse {
    @JsonProperty("id")
    Long id;
    @JsonProperty("merchantId")
    Long merchantId;
    @JsonProperty("productName")
    String productName;
    @JsonProperty("price")
    Double price;
    @JsonProperty("qty")
    Integer qty;
}
