package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.demo1.mapper")  // 关键：扫描 Mapper 接口

public class Demo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
