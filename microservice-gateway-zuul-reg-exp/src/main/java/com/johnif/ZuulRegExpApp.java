package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@EnableZuulProxy
public class ZuulRegExpApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello ZuulRegExpApp!" );
        SpringApplication.run(ZuulRegExpApp.class,args);
    }
}
