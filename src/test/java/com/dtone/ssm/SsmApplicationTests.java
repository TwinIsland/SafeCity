package com.dtone.ssm;

import com.dtone.ssm.dao.IUserDao;
import com.dtone.ssm.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SsmApplicationTests {

    @Autowired
    private IUserDao userDao;
    @Test
    void contextLoads() {
    }
    @Test
    void selectUserTest(){
        UserEntity userEntity = userDao.selectUser("张三","123456");
        //断言
        Assert.notNull(userEntity);
    }
    @Test
    void selectAllUserTest(){
        List<UserEntity> userEntities =userDao.selectAllUser();
        //断言
        Assert.notNull(userEntities);
    }


}
