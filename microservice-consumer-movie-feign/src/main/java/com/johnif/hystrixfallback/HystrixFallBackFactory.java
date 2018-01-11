package com.johnif.hystrixfallback;

import com.johnif.entity.User;
import com.johnif.feigncontroller.UserFeignClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by yf on 2017/12/28.
 */
@Component
public class HystrixFallBackFactory implements FallbackFactory<UserFeignClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixFallBackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        LOGGER.info("hystrixFactory is work",throwable.getMessage());
        return new UserFeignClientWithFactory() {
            @Override
            public User findById( Long id) {
                User user = new User();
                user.setId(-1L);
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
        };
    }
}
