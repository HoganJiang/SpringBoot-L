package com.yijiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-23
 * @Description: PACKAGE_NAME
 */

//启动类
//可以自动扫描当前类所在包及子包的注解
//注意：此类要放入到包中  在 和controller包同一个层次即可
@SpringBootApplication
public class SpringBoot01Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01Application.class, args);
    }
}
