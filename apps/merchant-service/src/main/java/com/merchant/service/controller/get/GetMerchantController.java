package com.merchant.service.controller.get;

import com.common.aware.ResponseAware;
import com.merchant.core.usecase.get.GetMerchant;
import com.merchant.service.constant.Routes;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetMerchantController {

    private final GetMerchant getMerchant;

    @GetMapping(Routes.MERCHANT)
    @ResponseStatus(HttpStatus.OK)
    ResponseAware<GetMerchantRestResponse> get(@RequestParam("id") Long id){
        GetMerchantRestPresenter presenter = new GetMerchantRestPresenter();
        getMerchant.get(id,presenter);
        return presenter.get();
    }
}
