package com.dtone.ssm;

import com.dtone.ssm.dao.ILogDao;
import com.dtone.ssm.dao.IUserDao;
import com.dtone.ssm.entity.LogEntity;
import com.dtone.ssm.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import sun.rmi.runtime.Log;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SsmApplicationTests {

    @Autowired
    private IUserDao userDao;
    private ILogDao logDao;
    @Test
    void contextLoads() {
    }
    @Test
    void selectUserTest(){
        UserEntity userEntity = userDao.selectUser("superadmin","superadmin");
        //断言
        Assert.notNull(userEntity);
    }
    @Test
    void selectAllUserTest(){
        List<UserEntity> userEntities = userDao.selectAllUser();
        //断言
        Assert.notNull(userEntities);
    }
    @Test
    void insertUserTest(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("1");
        userEntity.setLevel("1");
        userEntity.setPassword("1");
        userEntity.setRealname("1");
        userDao.insertUser(userEntity);
    }
    @Test
    void deleteUserTest(){
        userDao.deleteUser(7);
    }
    @Test
    void selectAllLogTest(){
        List<LogEntity> logEntities = logDao.selectAllLog();
        Assert.notNull(logEntities);
    }
    @Test
    void slectLogByDateTest(Date date1,Date date2){
        List<LogEntity> logEntities = logDao.selectLogByDate(date1,date2);
        Assert.notNull(logEntities);
    }
    @Test
    void insertLogTest(){
        LogEntity logEntity = new LogEntity();
    }



}
