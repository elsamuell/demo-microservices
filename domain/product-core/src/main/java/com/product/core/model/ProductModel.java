package com.product.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductModel {
    Long id;
    Long merchantId;
    String productName;
    Double price;
    Integer qty;
}
