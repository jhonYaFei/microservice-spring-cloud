package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MovieRibbonWithOutEureka
{
    public static void main( String[] args )
    {
        System.out.println( "Hello MovieRibbonWithOutEureka!" );
        SpringApplication.run(MovieRibbonWithOutEureka.class,args);
    }
}
