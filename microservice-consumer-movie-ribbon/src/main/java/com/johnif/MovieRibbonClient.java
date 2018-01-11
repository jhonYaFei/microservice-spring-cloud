package com.johnif;

import com.johnif.config.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "microservice-provider-user",configuration = RibbonConfig.class)
@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
public class MovieRibbonClient
{
    public static void main( String[] args )
    {
        System.out.println( "Hello MovieRibbonClient!" );
        SpringApplication.run(MovieRibbonClient.class,args);
    }
}
