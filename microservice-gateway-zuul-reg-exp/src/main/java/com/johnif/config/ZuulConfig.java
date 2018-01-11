package com.johnif.config;

import com.johnif.zuulfilter.PreZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yf on 2018/1/5.
 */
@Configuration
public class ZuulConfig {
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper() {
        return new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }

    @Bean
    public PreZuulFilter getPreZuulFiter(){
        return new PreZuulFilter();
    }
}
