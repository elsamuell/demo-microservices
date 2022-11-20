package com.product.service.controller.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.core.model.ProductModel;
import com.product.core.usecase.create.CreateProductRequest;

import javax.validation.constraints.NotBlank;

public class CreateProductRequestDto implements CreateProductRequest {

    @NotBlank
    @JsonProperty("merchantId")
    private Long merchantId;
    @NotBlank
    @JsonProperty("productName")
    private String productName;
    @NotBlank
    @JsonProperty("price")
    private Double price;
    @NotBlank
    @JsonProperty("qty")
    private Integer qty;
    @Override
    public ProductModel toEntity() {
        return ProductModel.builder()
                .qty(qty)
                .price(price)
                .productName(productName)
                .merchantId(merchantId)
                .build();
    }

    @Override
    public Long getMerchantId() {
        return merchantId;
    }
}
