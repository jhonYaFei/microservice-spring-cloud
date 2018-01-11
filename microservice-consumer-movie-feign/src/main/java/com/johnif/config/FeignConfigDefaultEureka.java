package com.johnif.config;

import com.johnif.ExcludeFromComponentScan;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yf on 2017/12/22.
 */
@Configuration
@ExcludeFromComponentScan
public class FeignConfigDefaultEureka {
    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("yy", "yy");
    }
}
