package com.excmmy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.excmmy.mapper")
public class RunBoot {
    public static void main(String[] args) {
        SpringApplication.run(RunBoot.class);
    }
}