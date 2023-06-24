package com.account.book.mapper;

import com.account.book.dataobject.BacctOokBillRecordDO;

/**
 * @author 87735
 * @description 针对表【bacct_ook_bill_record(流水记录表（账单表）)】的数据库操作Mapper
 * @createDate 2023-06-24 16:57:46
 * @Entity com.account.book.dataobject.BacctOokBillRecord
 */
public interface BacctOokBillRecordMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BacctOokBillRecordDO record);

    int insertSelective(BacctOokBillRecordDO record);

    BacctOokBillRecordDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BacctOokBillRecordDO record);

    int updateByPrimaryKey(BacctOokBillRecordDO record);

}
