package com.vincent.mybatisplus.samples.quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.vincent.mybatisplus.samples.quickstart.mapper")
public class MybatisPlusSampleQuickstartApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusSampleQuickstartApplication.class, args);
    }
}
