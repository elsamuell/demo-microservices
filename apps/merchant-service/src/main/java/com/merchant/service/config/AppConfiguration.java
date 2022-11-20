package com.merchant.service.config;

import com.merchant.core.gateway.MerchantGateway;
import com.merchant.core.gateway.ProductGateway;
import com.merchant.core.usecase.create.CreateMerchant;
import com.merchant.core.usecase.create.CreateMerchantUseCase;
import com.merchant.core.usecase.get.GetMerchant;
import com.merchant.core.usecase.get.GetMerchantUseCase;
import com.merchant.core.usecase.products.GetProducts;
import com.merchant.core.usecase.products.GetProductsUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public CreateMerchant createMerchant(MerchantGateway merchantGateway) {
        return new CreateMerchantUseCase(merchantGateway);
    }

    @Bean
    public GetMerchant getMerchant(MerchantGateway merchantGateway) {
        return new GetMerchantUseCase(merchantGateway);
    }

    @Bean
    public GetProducts getProducts(ProductGateway productGateway) {
        return new GetProductsUseCase(productGateway);
    }
}
