package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaAnotherService
{
    public static void main( String[] args )
    {
        System.out.println( "Hello EurekaAnotherService!" );
        SpringApplication.run(EurekaAnotherService.class,args);
    }
}
