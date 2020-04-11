package com.excmmy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.excmmy.mapper")
@EnableCaching // 开启 Cache 注解标记
public class RunBoot {
    public static void main(String[] args) {
        SpringApplication.run(RunBoot.class);
    }
}
