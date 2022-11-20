package com.merchant.persistence.product;

import com.merchant.core.gateway.ProductGateway;
import com.merchant.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@RequiredArgsConstructor
public class ProductGatewayImplement implements ProductGateway {

    private final ProductRepository productRepository;

    @Override
    public List<ProductModel> findByMerchantId(Long id) {
        List<ProductModel> productModelList = new LinkedList<>();
        productRepository.findByMerchantId(id)
                .getData()
                .stream()
                .forEach(value->{
                    productModelList.add(
                            ProductModel.builder()
                                    .id(value.id)
                                    .price(value.price)
                                    .productName(value.productName)
                                    .qty(value.qty)
                                    .build());
                }
        );
        return productModelList;
    }
}
