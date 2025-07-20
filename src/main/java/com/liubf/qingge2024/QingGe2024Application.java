package com.liubf.qingge2024;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liubf.qingge2024.mapper")
public class QingGe2024Application {

    public static void main(String[] args) {
        SpringApplication.run(QingGe2024Application.class, args);
    }

}
