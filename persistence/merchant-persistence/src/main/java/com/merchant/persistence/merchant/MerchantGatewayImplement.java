package com.merchant.persistence.merchant;

import com.merchant.core.gateway.MerchantGateway;
import com.merchant.core.model.MerchantModel;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class MerchantGatewayImplement implements MerchantGateway {

    private final MerchantRepository merchantRepository;

    @Override
    public MerchantModel create(MerchantModel merchantModel) {
        MerchantEntity merchant = MerchantEntity.builder()
                .merchantName(merchantModel.getMerchantName())
                .build();
        return toMerchantModel(merchantRepository.save(merchant));
    }

    @Override
    public Optional<MerchantModel> findById(Long id) {
        return merchantRepository.findById(id).flatMap(v->
                Optional.ofNullable(toMerchantModel(v))
        );
    }

    @Override
    public Optional<MerchantModel> findByMerchantName(String name) {
       return merchantRepository.findByMerchantName(name).flatMap(v->
                   Optional.ofNullable(toMerchantModel(v))
       );
    }

    private MerchantModel toMerchantModel(MerchantEntity entity) {
        return MerchantModel.builder()
                .id(entity.getId())
                .merchantName(entity.merchantName)
                .build();
    }
}
