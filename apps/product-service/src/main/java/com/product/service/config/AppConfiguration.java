package com.product.service.config;

import com.product.core.gateway.MerchantGateway;
import com.product.core.gateway.ProductGateway;
import com.product.core.usecase.create.CreateProduct;
import com.product.core.usecase.create.CreateProductUseCase;
import com.product.core.usecase.delete.DeleteProduct;
import com.product.core.usecase.delete.DeleteProductUseCase;
import com.product.core.usecase.list.ListProduct;
import com.product.core.usecase.list.ListProductUseCase;
import com.product.core.usecase.update.UpdateProduct;
import com.product.core.usecase.update.UpdateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public CreateProduct createProduct(ProductGateway productGateway, MerchantGateway merchantGateway) {
        return new CreateProductUseCase(productGateway, merchantGateway);
    }

    @Bean
    public UpdateProduct updateProduct(ProductGateway productGateway) {
        return new UpdateProductUseCase(productGateway);
    }

    @Bean
    public DeleteProduct deleteProduct(ProductGateway productGateway) {
        return new DeleteProductUseCase(productGateway);
    }

    @Bean
    public ListProduct ListProduct(ProductGateway productGateway) {
        return new ListProductUseCase(productGateway);
    }
}
