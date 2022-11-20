package com.merchant.core.usecase.create;

import com.merchant.core.gateway.MerchantGateway;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateMerchantUseCase implements CreateMerchant{

    private final MerchantGateway merchantGateway;

    @Override
    public void create(CreateMerchantRequest request, CreateMerchantPresenter presenter) {
        merchantGateway.findByMerchantName(request.getMerchantName()).ifPresent(v->{
            throw new IllegalArgumentException("merchant name had already been taken");
        });
        presenter.present(merchantGateway.create(request.toEntity()));
    }
}
