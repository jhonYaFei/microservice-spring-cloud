package com.johnif;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by yf on 2017/12/28.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashBoardApp {
    public static void main( String[] args )
    {
        SpringApplication.run(DashBoardApp.class,args);
    }
}
