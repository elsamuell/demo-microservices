package com.product.core.gateway;

import com.product.core.model.MerchantModel;

import java.util.Optional;

public interface MerchantGateway {
    Optional<MerchantModel> findByMerchantId(Long id);
}
