package com.product.service.controller.update;

import com.common.aware.ResponseAware;
import com.product.core.usecase.update.UpdateProduct;
import com.product.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UpdateProductController {

    private final UpdateProduct updateProduct;

    @PutMapping(Routes.PRODUCT)
    @ResponseStatus(HttpStatus.OK)
    ResponseAware<UpdateProductRestResponse> update(
            @RequestBody UpdateProductRequestDto request,
            @RequestParam("id") Long id
    ){
        UpdateProductRestPresenter presenter = new UpdateProductRestPresenter();
        request.setId(id);
        updateProduct.update(request,presenter);
        return presenter.get();
    }
}
