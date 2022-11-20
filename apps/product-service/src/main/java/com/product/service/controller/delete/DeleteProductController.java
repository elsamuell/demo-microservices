package com.product.service.controller.delete;

import com.product.core.usecase.delete.DeleteProduct;
import com.product.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteProductController {

    private final DeleteProduct deleteProduct;

    @DeleteMapping(Routes.PRODUCT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@RequestParam("id") Long id){
        deleteProduct.delete(id);
    }
}
