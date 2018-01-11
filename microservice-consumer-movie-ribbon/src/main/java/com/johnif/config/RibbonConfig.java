package com.johnif.config;

import com.johnif.ExcludeFromComponentScan;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yf on 2017/12/20.
 */
@Configuration
@ExcludeFromComponentScan
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(){
        return  new RandomRule();
    }
}
