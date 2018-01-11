package com.johnif.feigncontroller;

import com.johnif.config.FeignConfig;
import com.johnif.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by yf on 2017/12/22.
 */
@FeignClient(name = "microservice-provider-user-defalutfeign",configuration = FeignConfig.class)
public interface UserFeignClientDefault {
    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);
}
