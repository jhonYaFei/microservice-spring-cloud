package com.johnif.feigncontroller;

import com.johnif.config.FeignConfigDefaultEureka;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yf on 2017/12/22.
 */
@FeignClient(url = "http://localhost:8761/",configuration = FeignConfigDefaultEureka.class,name = "connectEureka")
public interface UserFeignClientConnectEureka {
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
