package com.account.book.service;

import com.account.book.dto.AcctBookUserDTO;

/**
 * 用户表服务
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/6/24 16:39
 */
public interface UserService {

    AcctBookUserDTO register(AcctBookUserDTO userDTO);

    AcctBookUserDTO getByUsername(String username);

}
