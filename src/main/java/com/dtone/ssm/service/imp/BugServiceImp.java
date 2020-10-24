package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IBugDao;
import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.service.IBugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 病害业务逻辑实现类
 * @data 2020/10/24 15:38
 */
@Service
@Transactional //申明式事务管理
public class BugServiceImp implements IBugService {
    @Autowired
    private IBugDao bugDao;
    @Override
    public List<BugEntity> findAllBug() {
        List<BugEntity> allBug = bugDao.selectAllBug();
        return allBug;
    }

    @Override
    public List<BugEntity> findBugByVague(String name, String host) {
        List<BugEntity> bugByVague = bugDao.selectBugByVague(name,host);
        return bugByVague;
    }
}
