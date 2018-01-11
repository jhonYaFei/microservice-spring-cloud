package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UserClient
{
    public static void main( String[] args )
    {
        System.out.println( "Hello UserClient!" );
        SpringApplication.run(UserClient.class,args);
    }
}
