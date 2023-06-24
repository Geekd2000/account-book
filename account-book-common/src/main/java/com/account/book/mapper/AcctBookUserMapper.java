package com.account.book.mapper;

import com.account.book.dataobject.AcctBookUserDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author 87735
 * @description 针对表【acct_book_user(用户表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookUserDO
 */
public interface AcctBookUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookUserDO record);

    int insertSelective(AcctBookUserDO record);

    AcctBookUserDO selectByPrimaryKey(Long id);

    /**
     * 根据username查找用户
     * @param username
     * @return
     */
    AcctBookUserDO selectByUsername(@Param("username") String username);

    int updateByPrimaryKeySelective(AcctBookUserDO record);

    int updateByPrimaryKey(AcctBookUserDO record);

}
