package com.merchant.core.usecase.create;

import com.common.aware.EntityAwareWithoutParam;
import com.merchant.core.model.MerchantModel;

public interface CreateMerchantRequest extends EntityAwareWithoutParam<MerchantModel> {
    String getMerchantName();
}
