package com.account.book.mapper;

import com.account.book.dataobject.AcctBookRecExpTypeDO;

/**
 * @author 87735
 * @description 针对表【acct_book_rec_exp_type(收支分类表)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.AcctBookRecExpType
 */
public interface AcctBookRecExpTypeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(AcctBookRecExpTypeDO record);

    int insertSelective(AcctBookRecExpTypeDO record);

    AcctBookRecExpTypeDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AcctBookRecExpTypeDO record);

    int updateByPrimaryKey(AcctBookRecExpTypeDO record);

}
