package com.merchant.service.controller.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class CreateMerchantRestResponse {
    @JsonProperty("id")
    Long id;
    @JsonProperty("merchantName")
    String merchantName;
}
