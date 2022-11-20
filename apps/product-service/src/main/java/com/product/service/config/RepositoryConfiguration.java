package com.product.service.config;

import com.product.core.gateway.MerchantGateway;
import com.product.core.gateway.ProductGateway;
import com.product.persistence.merchant.MerchantGatewayImplement;
import com.product.persistence.merchant.MerchantRepository;
import com.product.persistence.product.ProductGatewayImplement;
import com.product.persistence.product.ProductRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.product.persistence")
@EnableJpaRepositories(basePackages = "com.product.persistence")
@EnableFeignClients("com.product.persistence")
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
