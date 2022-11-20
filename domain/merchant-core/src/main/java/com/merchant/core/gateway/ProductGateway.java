package com.merchant.core.gateway;

import com.merchant.core.model.ProductModel;

import java.util.List;

public interface ProductGateway {
    List<ProductModel> findByMerchantId(Long id);
}
