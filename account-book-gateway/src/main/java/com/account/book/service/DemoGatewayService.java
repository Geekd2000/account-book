package com.account.book.service;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author junye
 * @date 2023-04-26 20:26
 */
@Service
public class DemoGatewayService {

    @DubboReference
    private DemoService demoService;

    public String getOrder() {
        return demoService.getUser();
    }

}
