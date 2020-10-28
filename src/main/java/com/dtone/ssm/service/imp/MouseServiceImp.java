package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IMedicamentDao;
import com.dtone.ssm.dao.IMouseDao;
import com.dtone.ssm.entity.MouseEntity;
import com.dtone.ssm.service.IMouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 鼠害业务逻辑接口实现类
 * @data 2020/10/24 15:53
 */

@Service
@Transactional //申明式事务管理
public class MouseServiceImp implements IMouseService {
    @Autowired
    private IMouseDao mouseDao;


    @Override
    public List<MouseEntity> findAllMouse() {
        List<MouseEntity> allMouse = mouseDao.selectAllMouse();
        return allMouse;
    }

    @Override
    public List<MouseEntity> findMouseByVague(String name) {
        List<MouseEntity> mouseByVague = mouseDao.selectMouseByVague(name);
        return mouseByVague;
    }
}
