package com.account.book.mapper;

import com.account.book.dataobject.AcctBookRelDO;

/**
 * @author 87735
 * @description 针对表【acct_book_rel(角色权限表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookRel
 */
public interface AcctBookRelMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookRelDO record);

    int insertSelective(AcctBookRelDO record);

    AcctBookRelDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctBookRelDO record);

    int updateByPrimaryKey(AcctBookRelDO record);

}
