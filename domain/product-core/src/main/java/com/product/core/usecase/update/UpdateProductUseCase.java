package com.product.core.usecase.update;

import com.product.core.gateway.ProductGateway;
import com.product.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdateProductUseCase implements UpdateProduct {

    private final ProductGateway productGateway;

    @Override
    public void update(UpdateProductRequest request, UpdateProductPresenter presenter) {
        ProductModel productModelEx = productGateway.findById(request.getId())
                .orElseThrow(()->{throw new IllegalArgumentException("product id is not found");});
        ProductModel productModel = productGateway.update(request.toEntity(productModelEx));
        presenter.present(productModel);
    }
}
