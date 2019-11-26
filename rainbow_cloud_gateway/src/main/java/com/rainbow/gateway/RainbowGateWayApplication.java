package com.rainbow.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: 郑立轩
 * @since: 2019/11/26
 * create at : 2019/11/26 21:17
 */
@SpringBootApplication
@EnableEurekaClient
public class RainbowGateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(RainbowGateWayApplication.class, args);
    }
}
