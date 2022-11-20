package com.product.core.usecase.create;

import com.product.core.gateway.MerchantGateway;
import com.product.core.gateway.ProductGateway;
import com.product.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateProductUseCase implements CreateProduct{

    private final ProductGateway productGateway;
    private final MerchantGateway merchantGateway;

    @Override
    public void create(CreateProductRequest request, CreateProductPresenter presenter) {
        merchantGateway.findByMerchantId(request.getMerchantId())
                .orElseThrow(()->{throw new IllegalArgumentException("merchant id is not found");});
        ProductModel productModel = productGateway.create(request.toEntity());
        presenter.present(productModel);
    }
}
