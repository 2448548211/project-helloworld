package com.clever.chen.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这是一个主程序类 使用@SpringBootApplication来标注一个主程序类，说明这是一个SpringBoot应用
 * @author ChenWang
 * @className springboot
 * @date 2020/11/13 20:46
 * @since JDK 1.8
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        /*Spring应用启动起来*/
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
