package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IUserDao;
import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 周垣枳
 **/
@Service
@Transactional //申明式事务管理
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public boolean checkUser(String name, String password) {
        UserEntity userEntity = userDao.selectUser(name, password);
        if(userEntity != null){
            return true;
        }
        return false;
    }

    @Override
    public String getUsrRealName(String name) {
        return userDao.selectSpecUserName(name);
    }

    @Override
    public boolean insertUser(UserEntity userEntity) {
        int i = userDao.selectUserCount(userEntity.getName());
        if(i == 0){
            userDao.insertUser(userEntity);
            return true;
        }
        return false;
    }
}
