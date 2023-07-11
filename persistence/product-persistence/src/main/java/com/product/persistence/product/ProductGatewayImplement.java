package com.product.persistence.product;

import com.product.core.gateway.ProductGateway;
import com.product.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class ProductGatewayImplement implements ProductGateway {

    private final ProductRepository productRepository;

    @Override
    public ProductModel create(ProductModel productModel) {
        ProductEntity productEntity = ProductEntity.builder()
                .productName(productModel.getProductName())
                .price(productModel.getPrice())
                .qty(productModel.getQty())
                .merchantId(productModel.getMerchantId())
                .build();
        return toProductModel(productRepository.save(productEntity));
    }

    @Override
    public List<ProductModel> findByMerchantId(Long id) {
        return productRepository.findByMerchantId(id).stream().map(v->
                    ProductModel.builder()
                            .merchantId(v.getMerchantId())
                            .productName(v.getProductName())
                            .id(v.getId())
                            .price(v.getPrice())
                            .qty(v.getQty())
                            .build());
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<ProductModel> findById(Long id) {
        return productRepository.findById(id).flatMap(v->Optional.ofNullable(toProductModel(v)));
    }

    @Override
    public ProductModel update(ProductModel productModel) {
        ProductEntity productEntity = ProductEntity.builder()
                .id(productModel.getId())
                .productName(productModel.getProductName())
                .price(productModel.getPrice())
                .qty(productModel.getQty())
                .merchantId(productModel.getMerchantId())
                .build();
        return toProductModel(productRepository.save(productEntity));
    }

    private ProductModel toProductModel(ProductEntity productEntity){
        return ProductModel.builder()
                .productName(productEntity.getProductName())
                .qty(productEntity.getQty())
                .price(productEntity.getPrice())
                .id(productEntity.getId())
                .merchantId(productEntity.getMerchantId())
                .build();
    }
}
