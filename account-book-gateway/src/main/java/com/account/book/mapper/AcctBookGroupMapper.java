package com.account.book.mapper;

import com.account.book.dataobject.AcctBookGroupDO;

/**
 * @author 87735
 * @description 针对表【acct_book_group(团队表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookGroup
 */
public interface AcctBookGroupMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookGroupDO record);

    int insertSelective(AcctBookGroupDO record);

    AcctBookGroupDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctBookGroupDO record);

    int updateByPrimaryKey(AcctBookGroupDO record);

}
