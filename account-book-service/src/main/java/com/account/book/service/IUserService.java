package com.account.book.service;

import com.account.book.dto.AcctBookUserDTO;
import com.account.book.result.Response;

/**
 * 用户表服务
 *
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/6/24 16:39
 */
public interface IUserService {

    AcctBookUserDTO register(AcctBookUserDTO userDTO);

    AcctBookUserDTO getByUsername(String username);

}
