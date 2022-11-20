package com.merchant.core.usecase.products;

import com.merchant.core.gateway.ProductGateway;
import com.merchant.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GetProductsUseCase implements GetProducts {

    private final ProductGateway productGateway;

    @Override
    public void get(Long id, GetProductsPresenter presenter) {
        List<ProductModel> productList = productGateway.findByMerchantId(id);
        presenter.present(productList);
    }
}
