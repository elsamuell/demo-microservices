package com.product.service.controller.list;

import com.common.aware.ResponseAware;
import com.product.core.usecase.list.ListProduct;
import com.product.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListProductController {

    private final ListProduct listProduct;

    @GetMapping(Routes.PRODUCTS)
    @ResponseStatus(HttpStatus.OK)
    ResponseAware<List<ListProductRestResponse>> get(@RequestParam("merchantId") Long merchantId){
        ListProductRestPresenter presenter = new ListProductRestPresenter();
        listProduct.get(merchantId,presenter);
        return presenter.get();
    }
}
