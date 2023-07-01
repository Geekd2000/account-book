package com.account.book.controller;

import com.account.book.dto.AcctBookUserDTO;
import com.account.book.enums.ResponseEnum;
import com.account.book.result.Response;
import com.account.book.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/6/24 18:12
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping("/getByUsername")
    public Response<AcctBookUserDTO> getByUsername(@RequestParam("username") String username) {
        log.info("getByUsername arg is {}", username);
        if (StringUtils.isBlank(username)) {
            return Response.failure(ResponseEnum.EX_ARG_NULL);
        }
        AcctBookUserDTO userDTO = userService.getByUsername(username);
        if (null == userDTO) {
            return Response.success(null);
        }
        return Response.success(userDTO);
    }

}
