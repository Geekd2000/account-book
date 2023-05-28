package com.ipotato.book.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author junye
 * @date 2023-04-26 20:26
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String getUser() {
        return "duoduo";
    }

}
