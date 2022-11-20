package com.merchant.service.controller.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchant.core.model.MerchantModel;
import com.merchant.core.usecase.create.CreateMerchantRequest;

import javax.validation.constraints.NotBlank;

public class CreateMerchantRequestDto implements CreateMerchantRequest {

    @NotBlank
    @JsonProperty("merchantName")
    private String merchantName;

    @Override
    public MerchantModel toEntity() {
        return MerchantModel.builder()
                .merchantName(merchantName)
                .build();
    }

    @Override
    public String getMerchantName() {
        return merchantName;
    }
}
