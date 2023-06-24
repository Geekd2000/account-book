package com.account.book.mapper;

import com.account.book.dataobject.AcctBookUserRoleDO;

/**
 * @author 87735
 * @description 针对表【acct_book_user_role(用户角色关系表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookUserRoleDO
 */
public interface AcctBookUserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookUserRoleDO record);

    int insertSelective(AcctBookUserRoleDO record);

    AcctBookUserRoleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctBookUserRoleDO record);

    int updateByPrimaryKey(AcctBookUserRoleDO record);

}
