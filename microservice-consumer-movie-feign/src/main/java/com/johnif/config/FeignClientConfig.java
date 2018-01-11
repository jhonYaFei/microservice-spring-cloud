package com.johnif.config;

import com.johnif.ExcludeFromComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yf on 2017/12/28.
 */
@Configuration
@ExcludeFromComponentScan
public class FeignClientConfig {
    /*@Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }*/
}
