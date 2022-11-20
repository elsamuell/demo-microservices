package com.product.persistence.merchant;

import com.common.aware.ResponseAware;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "MERCHANT-SERVICE", contextId = "MERCHANT-SERVICE")
public interface MerchantRepository {
    @GetMapping("/merchant")
    ResponseAware<MerchantEntity> findByMerchantId(@RequestParam("id") Long id);
}
