package com.product.service.controller.create;

import com.common.aware.ResponseAware;
import com.product.core.model.ProductModel;
import com.product.core.usecase.create.CreateProductPresenter;

public class CreateProductRestPresenter implements CreateProductPresenter {

    private CreateProductRestResponse createProductRestResponse;

    @Override
    public void present(ProductModel productModel) {
        createProductRestResponse = CreateProductRestResponse.builder()
                .id(productModel.getId())
                .productName(productModel.getProductName())
                .qty(productModel.getQty())
                .merchantId(productModel.getMerchantId())
                .price(productModel.getPrice())
                .build();
    }

    public ResponseAware<CreateProductRestResponse> get(){
        return new ResponseAware<>(createProductRestResponse);
    }

}
