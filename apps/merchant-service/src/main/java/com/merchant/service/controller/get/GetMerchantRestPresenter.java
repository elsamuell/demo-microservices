package com.merchant.service.controller.get;

import com.common.aware.ResponseAware;
import com.merchant.core.model.MerchantModel;
import com.merchant.core.usecase.get.GetMerchantPresenter;

public class GetMerchantRestPresenter implements GetMerchantPresenter {

    private GetMerchantRestResponse getMerchantRestResponse;

    @Override
    public void present(MerchantModel merchantModel) {
        getMerchantRestResponse = GetMerchantRestResponse.builder()
                .id(merchantModel.getId())
                .merchantName(merchantModel.getMerchantName())
                .build();
    }

    public ResponseAware<GetMerchantRestResponse> get(){
        return new ResponseAware<>(getMerchantRestResponse);
    }
}
