package com.hyf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : heyanfeng
 * create at:  2020-06-07  20:06
 * @description: springboot 启动类
 */
@SpringBootApplication(scanBasePackages="com.hyf")
public class Start {
    public static void main(String[] args) {
        SpringApplication.run(Start.class,args);
    }
}
