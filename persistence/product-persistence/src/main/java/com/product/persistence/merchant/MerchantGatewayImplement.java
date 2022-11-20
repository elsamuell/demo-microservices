package com.product.persistence.merchant;

import com.product.core.gateway.MerchantGateway;
import com.product.core.model.MerchantModel;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class MerchantGatewayImplement implements MerchantGateway {
    private final MerchantRepository merchantRepository;
    @Override
    public Optional<MerchantModel> findByMerchantId(Long id) {
        MerchantEntity merchantEntity = merchantRepository.findByMerchantId(id).getData();
        if(merchantEntity!=null){
            return Optional.of(toMerchantModel(merchantEntity));
        }
        return Optional.empty();
    }

    private MerchantModel toMerchantModel(MerchantEntity merchantEntity) {
        return new MerchantModel(merchantEntity.id,merchantEntity.merchantName);
    }
}
