package com.merchant.service.config;

import com.merchant.core.gateway.MerchantGateway;
import com.merchant.core.gateway.ProductGateway;
import com.merchant.persistence.merchant.MerchantGatewayImplement;
import com.merchant.persistence.merchant.MerchantRepository;
import com.merchant.persistence.product.ProductGatewayImplement;
import com.merchant.persistence.product.ProductRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.merchant.persistence")
@EnableJpaRepositories(basePackages = "com.merchant.persistence")
@EnableFeignClients("com.merchant.persistence")
public class RepositoryConfiguration {

    @Bean
    public MerchantGateway merchantGateway(MerchantRepository merchantRepository) {
        return new MerchantGatewayImplement(merchantRepository);
    }

    @Bean
    public ProductGateway productGateway(ProductRepository productRepository) {
        return new ProductGatewayImplement(productRepository);
    }
}
