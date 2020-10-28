package com.dtone.ssm.service;

import com.dtone.ssm.entity.RecordEntity;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  18:47
 * @desc
 */
public interface IRecordService
{
    //查询所有
    public List<RecordEntity> findAllRecord();
    //添加
    public int addRecord(RecordEntity recordEntity);
    public void deleRecordByID(int id);
}
