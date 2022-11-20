package com.product.core.usecase.list;

import com.product.core.model.ProductModel;

import java.util.List;

public interface ListProductPresenter {
    void present(List<ProductModel> productModelList);
}
