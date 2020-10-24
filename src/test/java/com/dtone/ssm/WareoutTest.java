package com.dtone.ssm;

import com.dtone.ssm.dao.IWareoutDao;
import com.dtone.ssm.entity.WareoutEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/23  18:07
 * @desc
 */
@SpringBootTest
public class WareoutTest
{
    @Autowired
    private IWareoutDao iWareoutDao;

    @Test
    void selectAllWareoutTest()
    {
        List<WareoutEntity> wareoutEntities = iWareoutDao.selectAllWareout();
        Assert.notNull(wareoutEntities);
    }
    /*
    void selectWOutByDateAndPersonTest()
    {
        List<WareoutEntity> wareoutEntities = iWareoutDao.selectWOutByDateAndPerson();

    }

    void insertWareout()
    {
        WareoutEntity wareoutEntity = new WareoutEntity();
        wareoutEntity.setDate(new Date(2020,9,17));
        wareoutEntity.setOut_class("11");
        wareoutEntity.setOut_person("阿张");
        iWareoutDao.insertWareout(wareoutEntity);
    }

    void deleteWoutByID()
    {
        iWareoutDao.deleteWoutByID(6);
    }*/
}
