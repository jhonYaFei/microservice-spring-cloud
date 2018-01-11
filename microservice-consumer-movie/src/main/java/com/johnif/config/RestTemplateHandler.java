package com.johnif.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yf on 2017/12/14.
 */
@Configuration
public class RestTemplateHandler {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
