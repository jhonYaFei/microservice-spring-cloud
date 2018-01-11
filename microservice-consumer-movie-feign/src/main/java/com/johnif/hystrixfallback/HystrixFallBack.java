package com.johnif.hystrixfallback;

import com.johnif.entity.User;
import com.johnif.feigncontroller.UserFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by yf on 2017/12/28.
 */
@Component
public class HystrixFallBack implements UserFeignClient {

    @Override
    public User findById(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

    @Override
    public User postUser(@RequestBody User user) {
        return null;
    }

    @Override
    public User getUser(User user) {
        return null;
    }
}
