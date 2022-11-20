package com.merchant.service.controller.products;

import com.common.aware.ResponseAware;
import com.merchant.core.model.ProductModel;
import com.merchant.core.usecase.products.GetProductsPresenter;

import java.util.LinkedList;
import java.util.List;

public class GetProductsRestPresenter implements GetProductsPresenter {

    private List<GetProductsRestResponse> getProductsRestResponses;

    @Override
    public void present(List<ProductModel> productModelList) {
        getProductsRestResponses = new LinkedList<>();
        productModelList.stream().forEach(v->{
            getProductsRestResponses.add(
                    GetProductsRestResponse.builder()
                            .id(v.getId())
                            .productName(v.getProductName())
                            .qty(v.getQty())
                            .price(v.getPrice())
                            .build()
            );
        });
    }

    public ResponseAware<List<GetProductsRestResponse>> get(){
        return new ResponseAware<>(getProductsRestResponses);
    }

}
