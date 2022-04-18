package com.zgqstudy.miaoshaproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.zgqstudy.miaoshaproject"})
@MapperScan("com.zgqstudy.miaoshaproject.dao")
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
