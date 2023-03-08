package com.example.iesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.iesystem.dao")//扫描所有的dao接口所在的包
public class IeSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(IeSystemApplication.class, args);
    }

}
