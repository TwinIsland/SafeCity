package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IRecordDao;
import com.dtone.ssm.entity.RecordEntity;
import com.dtone.ssm.service.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  18:50
 * @desc
 */
@Service
@Transactional //申明式事务管理
public class RecordImp implements IRecordService
{
    @Autowired
    private IRecordDao iRecordDao;
    @Override
    public List<RecordEntity> findAllRecord()
    {
        List<RecordEntity> recordEntities = iRecordDao.selectAllRecord();
        return recordEntities;
    }

    @Override
    public int addRecord(RecordEntity recordEntity)
    {
        int i = iRecordDao.insertRecord(recordEntity);
        return  i;
    }

    @Override
    public void deleRecordByID(int id)
    {
    iRecordDao.deleteRecordByID(id);
    }
}
