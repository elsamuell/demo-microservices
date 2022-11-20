package com.merchant.persistence.product;

import com.common.aware.ResponseAware;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name= "PRODUCT-SERVICE", contextId = "PRODUCT-SERVICE")
public interface ProductRepository {
    @GetMapping("/products")
    ResponseAware<List<ProductEntity>> findByMerchantId(@RequestParam("merchantId") Long id);
}
