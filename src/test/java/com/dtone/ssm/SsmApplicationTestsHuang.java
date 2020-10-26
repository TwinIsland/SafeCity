package com.dtone.ssm;

import com.dtone.ssm.dao.IEventDao;
import com.dtone.ssm.dao.IExpertDao;
import com.dtone.ssm.dao.ILogDao;
import com.dtone.ssm.dao.IUserDao;
import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.entity.LogEntity;
import com.dtone.ssm.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SsmApplicationTests {

    @Autowired
    private IExpertDao expertDao;
    @Autowired
    private IEventDao eventDao;

    @Test
    void contextLoads() {
    }

    @Test
    void selectAllExpert() {
        List<ExpertEntity> expList = expertDao.selectAllExpert();
        Assert.notNull(expList);
    }

    @Test
    void searchExpert() {
        List<ExpertEntity> expList = expertDao.selectExpert("张三", "编程", "淘宝");
        Assert.notNull(expList);
    }

    //懒得测了
    void insertExpert(ExpertEntity en) {
        ExpertEntity enT = new ExpertEntity();
        enT.setUsrId(1);
        expertDao.insertExpert(enT);
    }


    @Test
    void selectAllEvent(){
        Assert.notNull(eventDao.selectAllEvent());
    }

    @Test
    void selectEvent(){
        Assert.notNull(eventDao.selectEvent("啦啦","2001-10-1","2003-10-1"));
    }

}
