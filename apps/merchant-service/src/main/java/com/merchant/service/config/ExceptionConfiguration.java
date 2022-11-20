package com.merchant.service.config;

import com.common.exception.ExceptionTranslator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionConfiguration {

    @Bean
    ExceptionTranslator errorWebExceptionHandler(){
        return new ExceptionTranslator();
    }
}