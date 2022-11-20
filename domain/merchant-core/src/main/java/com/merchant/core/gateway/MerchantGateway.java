package com.merchant.core.gateway;

import com.merchant.core.model.MerchantModel;

import java.util.Optional;

public interface MerchantGateway {
    MerchantModel create(MerchantModel merchantModel);
    Optional<MerchantModel> findById(Long id);
    Optional<MerchantModel> findByMerchantName(String name);
}
