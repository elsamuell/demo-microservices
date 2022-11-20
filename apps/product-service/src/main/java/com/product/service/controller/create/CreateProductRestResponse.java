package com.product.service.controller.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class CreateProductRestResponse {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("merchantId")
    private Long merchantId;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("qty")
    private Integer qty;
}
