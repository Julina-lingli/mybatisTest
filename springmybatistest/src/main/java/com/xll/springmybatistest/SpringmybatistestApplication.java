package com.xll.springmybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xll.springmybatistest")
public class SpringmybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatistestApplication.class, args);
    }

}
