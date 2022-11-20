package com.product.service.controller.update;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.product.core.model.ProductModel;
import com.product.core.usecase.update.UpdateProductRequest;

import javax.validation.constraints.NotBlank;

public class UpdateProductRequestDto implements UpdateProductRequest {
    @NotBlank
    @JsonProperty("id")
    private Long id;
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
    public ProductModel toEntity(ProductModel productModel) {
        return ProductModel.builder()
                .id(productModel.getId())
                .merchantId(productModel.getMerchantId())
                .qty(qty!=null?qty:productModel.getQty())
                .price(price!=null?price:productModel.getPrice())
                .productName(productName!=null?productName:productModel.getProductName())
                .build();
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
