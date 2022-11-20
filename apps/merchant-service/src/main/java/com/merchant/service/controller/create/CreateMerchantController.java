package com.merchant.service.controller.create;

import com.common.aware.ResponseAware;
import com.merchant.core.usecase.create.CreateMerchant;
import com.merchant.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateMerchantController {

    private final CreateMerchant createMerchant;

    @PostMapping(Routes.MERCHANT)
    @ResponseStatus(HttpStatus.CREATED)
    ResponseAware<CreateMerchantRestResponse> create(@RequestBody CreateMerchantRequestDto request){
        CreateMerchantRestPresenter presenter = new CreateMerchantRestPresenter();
        createMerchant.create(request,presenter);
        return presenter.get();
    }
}
