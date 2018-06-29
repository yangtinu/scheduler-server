package com.founder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: SpringBoot启动入口
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 15:36 2018/5/16
 */
@SpringBootApplication
@MapperScan("com.founder.job.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
