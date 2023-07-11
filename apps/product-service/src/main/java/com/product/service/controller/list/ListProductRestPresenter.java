package com.product.service.controller.list;

import com.common.aware.ResponseAware;
import com.product.core.model.ProductModel;
import com.product.core.usecase.list.ListProductPresenter;

import java.util.LinkedList;
import java.util.List;

public class ListProductRestPresenter implements ListProductPresenter {

    private List<ListProductRestResponse> listProductRestResponse;

    @Override
    public void present(List<ProductModel> productModelList) {
        return productModelList.stream()
                .map(v-> ListProductRestResponse.builder()
                                    .id(v.getId())
                                    .merchantId(v.getMerchantId())
                                    .price(v.getPrice())
                                    .productName(v.getProductName())
                                    .qty(v.getQty())
                                    .build());
    }

    ResponseAware<List<ListProductRestResponse>> get(){
        return new ResponseAware<>(listProductRestResponse);
    }
}
