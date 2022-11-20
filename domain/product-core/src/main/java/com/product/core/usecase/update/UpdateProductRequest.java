package com.product.core.usecase.update;

import com.common.aware.EntityAwareWithParam;
import com.product.core.model.ProductModel;

public interface UpdateProductRequest extends EntityAwareWithParam<ProductModel> {
    Long getId();
}
