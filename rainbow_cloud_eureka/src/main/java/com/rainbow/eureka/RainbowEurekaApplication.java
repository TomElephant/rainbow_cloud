package com.rainbow.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 郑立轩
 * @since: 2019/11/26
 * create at : 2019/11/26 20:46
 */
@SpringBootApplication
@EnableEurekaServer
public class RainbowEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(RainbowEurekaApplication.class, args);
    }

}
