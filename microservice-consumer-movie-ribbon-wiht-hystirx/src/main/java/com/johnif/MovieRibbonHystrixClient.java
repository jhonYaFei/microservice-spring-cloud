package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MovieRibbonHystrixClient
{
    public static void main( String[] args )
    {
        System.out.println( "Hello MovieRibbonHystrixClient!" );
        SpringApplication.run(MovieRibbonHystrixClient.class,args);
    }
}
