package com.product.core.usecase.list;

import com.product.core.gateway.ProductGateway;
import com.product.core.model.ProductModel;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListProductUseCase implements ListProduct {

    private final ProductGateway productGateway;

    @Override
    public void get(Long merchantId, ListProductPresenter presenter) {
        List<ProductModel> productModelList = productGateway.findByMerchantId(merchantId);
        presenter.present(productModelList);
    }
}
