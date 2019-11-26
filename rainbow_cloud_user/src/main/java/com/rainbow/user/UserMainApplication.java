package com.rainbow.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 项目名称：rainbow_cloud
 * 类 名 称：UserMainApplication
 * 类 描 述：test
 * 创建时间：2019-11-19 13:19
 * 创 建 人：leozheng
 */
@SpringBootApplication
@MapperScan(basePackages = "com.rainbow.user.dao")
@EnableEurekaClient
public class UserMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserMainApplication.class, args);

    }
}
