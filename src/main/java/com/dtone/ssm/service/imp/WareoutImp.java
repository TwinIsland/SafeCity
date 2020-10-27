package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IWareoutDao;
import com.dtone.ssm.entity.WareoutEntity;
import com.dtone.ssm.service.IWareoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  10:04
 * @desc
 */
@Service
@Transactional
public class WareoutImp implements IWareoutService
{
    @Autowired
    private IWareoutDao iWareoutDao;

    @Override
    public List<WareoutEntity> findAllWareout()
    {
        List<WareoutEntity> wareoutEntities = iWareoutDao.selectAllWareout();
        return wareoutEntities;
    }

    @Override
    public List<WareoutEntity> findWOutByDateAndPerson(Date date, String out_person)
    {
        List<WareoutEntity> wareoutEntities = iWareoutDao.selectWOutByDateAndPerson(date,out_person);
        return wareoutEntities;
    }

    @Override
    public int addWareout(WareoutEntity wareoutEntity)
    {
        int i = iWareoutDao.insertWareout(wareoutEntity);
        return i;
    }

    @Override
    public void deleWoutByID(int out_id)
    {
        iWareoutDao.deleteWoutByID(out_id);
    }
}
