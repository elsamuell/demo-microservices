package com.product.core.gateway;


import com.product.core.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {
    ProductModel create(ProductModel productModel);
    List<ProductModel> findByMerchantId(Long id);
    void delete(Long id);
    Optional<ProductModel> findById(Long id);
    ProductModel update(ProductModel productModel);
}
