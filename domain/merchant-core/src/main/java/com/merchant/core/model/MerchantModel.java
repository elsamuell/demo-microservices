package com.merchant.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MerchantModel {
    Long id;
    String merchantName;
}
