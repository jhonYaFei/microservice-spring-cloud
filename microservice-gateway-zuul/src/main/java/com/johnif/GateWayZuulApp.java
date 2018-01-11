package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class GateWayZuulApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello GateWayZuulApp!" );
        SpringApplication.run(GateWayZuulApp.class,args);
    }
}
