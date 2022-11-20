package com.product.service.controller.update;

import com.common.aware.ResponseAware;
import com.product.core.model.ProductModel;
import com.product.core.usecase.update.UpdateProductPresenter;

public class UpdateProductRestPresenter implements UpdateProductPresenter {

    private UpdateProductRestResponse updateProductRestResponse;

    @Override
    public void present(ProductModel productModel) {
        updateProductRestResponse = UpdateProductRestResponse.builder()
                .id(productModel.getId())
                .productName(productModel.getProductName())
                .qty(productModel.getQty())
                .merchantId(productModel.getMerchantId())
                .price(productModel.getPrice())
                .build();
    }

    public ResponseAware<UpdateProductRestResponse> get(){
        return new ResponseAware<>(updateProductRestResponse);
    }

}
