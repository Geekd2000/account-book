package com.account.book.mapper;

import com.account.book.dataobject.AcctBookGroupUserDO;

/**
 * @author 87735
 * @description 针对表【acct_book_group_user(团队用户关系表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookGroupUser
 */
public interface AcctBookGroupUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookGroupUserDO record);

    int insertSelective(AcctBookGroupUserDO record);

    AcctBookGroupUserDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctBookGroupUserDO record);

    int updateByPrimaryKey(AcctBookGroupUserDO record);

}
