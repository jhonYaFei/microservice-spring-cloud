package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApp
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Turbine!" );
        SpringApplication.run(TurbineApp.class,args);
    }
}
