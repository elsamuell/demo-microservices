package com.product.core.usecase.delete;

import com.product.core.gateway.ProductGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeleteProductUseCase implements DeleteProduct {

    private final ProductGateway productGateway;

    @Override
    public void delete(Long id) {
       productGateway.delete(id);
    }
}
