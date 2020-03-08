package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 *  主程序默认扫描当前包及其子包下的类
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // Spring应用启动起来
        SpringApplication.run(MainApplication.class,args);
    }
}
