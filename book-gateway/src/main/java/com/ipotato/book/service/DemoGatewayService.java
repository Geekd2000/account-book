package com.ipotato.book.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author junye
 * @date 2023-04-26 20:26
 */
@Service
public class DemoGatewayService {

    @Resource
    private RestTemplate restTemplate;

    public String getOrder() {
        return restTemplate.getForObject("http://localhost:8080/user", String.class);
    }

}
