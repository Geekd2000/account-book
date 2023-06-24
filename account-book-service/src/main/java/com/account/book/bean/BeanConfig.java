package com.account.book.bean;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/6/24 18:35
 */
@Configuration
public class BeanConfig {

    @Bean
    public DozerBeanMapper beanMapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        return mapper;
    }

}
