package com.product.service.controller.create;

import com.common.aware.ResponseAware;
import com.product.core.usecase.create.CreateProduct;
import com.product.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateProductController {

    private final CreateProduct createProduct;

    @PostMapping(Routes.PRODUCT)
    @ResponseStatus(HttpStatus.CREATED)
    ResponseAware<CreateProductRestResponse> create(@RequestBody CreateProductRequestDto request){
        CreateProductRestPresenter presenter = new CreateProductRestPresenter();
        createProduct.create(request,presenter);
        return presenter.get();
    }
}
