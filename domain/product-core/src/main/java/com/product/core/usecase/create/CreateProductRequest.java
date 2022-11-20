package com.product.core.usecase.create;

import com.common.aware.EntityAwareWithoutParam;
import com.product.core.model.ProductModel;

public interface CreateProductRequest extends EntityAwareWithoutParam<ProductModel> {
    Long getMerchantId();
}
