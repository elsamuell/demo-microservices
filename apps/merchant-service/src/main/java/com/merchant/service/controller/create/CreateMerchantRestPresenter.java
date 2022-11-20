package com.merchant.service.controller.create;

import com.common.aware.ResponseAware;
import com.merchant.core.model.MerchantModel;
import com.merchant.core.usecase.create.CreateMerchantPresenter;

public class CreateMerchantRestPresenter implements CreateMerchantPresenter {

    private CreateMerchantRestResponse createMerchantRestResponse;

    @Override
    public void present(MerchantModel merchantModel) {
        createMerchantRestResponse = CreateMerchantRestResponse.builder()
                .id(merchantModel.getId())
                .merchantName(merchantModel.getMerchantName())
                .build();
    }

    public ResponseAware<CreateMerchantRestResponse> get(){
        return new ResponseAware<>(createMerchantRestResponse);
    }
}
