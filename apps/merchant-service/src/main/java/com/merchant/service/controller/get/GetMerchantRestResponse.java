package com.merchant.service.controller.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class GetMerchantRestResponse {
    @JsonProperty("id")
    Long id;
    @JsonProperty("merchantName")
    String merchantName;
}
