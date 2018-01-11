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
public class ConfigClient
{
    public static void main( String[] args )
    {
        System.out.println( "Hello ConfigClient!" );
        SpringApplication.run(ConfigClient.class,args);
    }
}
