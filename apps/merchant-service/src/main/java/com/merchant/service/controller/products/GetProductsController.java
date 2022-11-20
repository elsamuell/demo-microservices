package com.merchant.service.controller.products;

import com.common.aware.ResponseAware;
import com.merchant.core.usecase.products.GetProducts;
import com.merchant.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GetProductsController {

    private final GetProducts getProducts;

    @GetMapping(Routes.PRODUCT)
    @ResponseStatus(HttpStatus.OK)
    ResponseAware<List<GetProductsRestResponse>> get(@RequestParam("id") Long id){
        GetProductsRestPresenter presenter = new GetProductsRestPresenter();
        getProducts.get(id,presenter);
        return presenter.get();
    }
}
