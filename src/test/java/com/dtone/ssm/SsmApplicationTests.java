package com.dtone.ssm;

import com.dtone.ssm.dao.IMedicamentDao;
import com.dtone.ssm.dao.IUserDao;
import com.dtone.ssm.dao.IWareoutDao;
import com.dtone.ssm.entity.MedicamentEntity;
import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.entity.WareoutEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;


@SpringBootTest
class SsmApplicationTestsLi
{

    @Autowired
    private IUserDao userDao;

    @Test
    void contextLoads()
    {
    }

    @Test
    void selectUserTest()
    {
        UserEntity userEntity = userDao.selectUser("superadmin", "superadmin");
        //断言
        Assert.notNull(userEntity);
    }

    @Test
    void selectAllUserTest()
    {
        List<UserEntity> userEntities = userDao.selectAllUser();
        //断言
        Assert.notNull(userEntities);
    }

    @Test
    void insertUserTest()
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("1");
        userEntity.setLevel("1");
        userEntity.setPassword("1");
        userEntity.setRealname("1");
        userDao.insertUser(userEntity);
    }



}

