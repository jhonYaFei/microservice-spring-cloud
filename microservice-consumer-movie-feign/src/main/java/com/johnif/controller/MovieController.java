package com.johnif.controller;

import com.johnif.entity.User;
import com.johnif.feigncontroller.UserFeignClient;
import com.johnif.feigncontroller.UserFeignClientConnectEureka;
import com.johnif.feigncontroller.UserFeignClientDefault;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private UserFeignClientDefault userFeignClientDefault;
    @Autowired
    private UserFeignClientConnectEureka userFeignClientConnectEureka;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

    @PostMapping("/test-post")
    public User testPost(User user) {
        return this.userFeignClient.postUser(user);
    }

    @GetMapping("/test-get")
    public User testGet(User user) {
        return this.userFeignClient.getUser(user);
    }

    @GetMapping("/moviefeign/{id}")
    public User findByIdByFeignDefault(@PathVariable Long id) {
        return userFeignClientDefault.findById(id);
    }

    @GetMapping("/eureka/{serviceName}")
    public String findServiceInfoFromEurekaByServiceName(@PathVariable String serviceName) {
        return this.userFeignClientConnectEureka.findServiceInfoFromEurekaByServiceName(serviceName);
    }
}
