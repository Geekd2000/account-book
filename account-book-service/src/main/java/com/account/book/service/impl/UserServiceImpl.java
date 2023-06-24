package com.account.book.service.impl;

import com.account.book.dataobject.AcctBookUserDO;
import com.account.book.dto.AcctBookUserDTO;
import com.account.book.mapper.AcctBookUserMapper;
import com.account.book.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : JiangJunYe
 * @version : 1.0
 * @date : 2023/6/24 16:44
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private Mapper beanMapper;
    @Resource
    private AcctBookUserMapper acctBookUserMapper;

    @Override
    public AcctBookUserDTO register(AcctBookUserDTO userDTO) {
        return null;
    }

    @Override
    public AcctBookUserDTO getByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            throw new RuntimeException("用户名不能为空!");
        }
        AcctBookUserDO userDO = acctBookUserMapper.selectByUsername(username);
        if (null == userDO) {
            return null;
        }
        return beanMapper.map(userDO, AcctBookUserDTO.class);
    }

}
