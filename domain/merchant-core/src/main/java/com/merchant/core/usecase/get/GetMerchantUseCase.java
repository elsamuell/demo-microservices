package com.merchant.core.usecase.get;

import com.merchant.core.gateway.MerchantGateway;
import com.merchant.core.model.MerchantModel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GetMerchantUseCase implements GetMerchant {

    private final MerchantGateway merchantGateway;

    @Override
    public void get(Long id, GetMerchantPresenter presenter) {
        MerchantModel merchantModel = merchantGateway.findById(id)
                .orElseThrow(()->{throw new IllegalArgumentException("merchant id is not found");});
        presenter.present(merchantModel);
    }
}
