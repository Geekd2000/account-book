package com.ipotato.book.controller;

import com.ipotato.book.service.DemoGatewayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author junye
 * @date 2023-04-26 20:26
 */
@RestController
@RequestMapping("/demo")
public class DemoGatewayController {

    @Resource
    private DemoGatewayService demoGatewayService;

    @GetMapping("/order")
    public String getOrder() {
        return demoGatewayService.getOrder();
    }
}
