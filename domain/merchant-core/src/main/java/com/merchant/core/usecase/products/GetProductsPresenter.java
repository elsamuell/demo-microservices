package com.merchant.core.usecase.products;

import com.merchant.core.model.ProductModel;

import java.util.List;

public interface GetProductsPresenter {
    void present(List<ProductModel> productModelList);
}
