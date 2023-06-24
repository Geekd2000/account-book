package com.account.book;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.account.book.mapper")
public class AccountBookGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountBookGatewayApplication.class, args);
    }

}
