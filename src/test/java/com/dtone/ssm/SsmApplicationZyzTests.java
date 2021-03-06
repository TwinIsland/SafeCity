package com.dtone.ssm;

import com.dtone.ssm.dao.*;
import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.entity.LogEntity;
import com.dtone.ssm.entity.SicknessEntity;
import com.dtone.ssm.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/23 18:29
 */
@SpringBootTest
class SsmApplicationZyzTests {

    @Autowired
    private IUserDao userDao;
    @Autowired
    private ILogDao logDao;
    @Autowired
    private IBugDao bugDao;
    @Autowired
    private ISicknessDao sicknessDao;
    @Autowired
    private IMouseDao mouseDao;
    @Autowired
    private IZoneDao zoneDao;
    @Autowired
    private ITeamDao iTeamDao;

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
    /* @Test
     void selectAllLogTest(){
         List<LogEntity> logEntities = logDao.selectAllLog();
         Assert.notNull(logEntities);
     }*/
   /* @Test
    void slectLogByDateTest(Date date1,Date date2){
        List<LogEntity> logEntities = logDao.selectLogByDate(date1,date2);
        Assert.notNull(logEntities);
    }*/
    @Test
    void insertLogTest(){
        LogEntity logEntity = new LogEntity();
    }
    @Test
    void selectAllBugTest(){
        List<BugEntity> bugEntities = bugDao.selectAllBug();
        System.out.println(bugEntities);
    }
    @Test
    void selectBugByVagueTest(){
        List<BugEntity> bugEntities = bugDao.selectBugByVague("黄","");
        System.out.println(bugEntities);
    }
    @Test
    void selectSickness(){
        List<SicknessEntity> sicknessEntities = sicknessDao.selectAllSickness();
        System.out.println(sicknessEntities);
    }



}
