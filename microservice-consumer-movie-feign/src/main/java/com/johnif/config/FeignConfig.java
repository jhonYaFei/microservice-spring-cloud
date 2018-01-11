package com.johnif.config;

import com.johnif.ExcludeFromComponentScan;
import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yf on 2017/12/22.
 */
@Configuration
@ExcludeFromComponentScan
public class FeignConfig {
    @Bean
    public Contract getContract(){
        return new feign.Contract.Default();
    }
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
