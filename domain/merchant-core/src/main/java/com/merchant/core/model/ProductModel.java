package com.merchant.core.model;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ProductModel {
    Long id;
    String productName;
    Double price;
    Integer qty;
}
