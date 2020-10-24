package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.ISicknessDao;
import com.dtone.ssm.entity.SicknessEntity;
import com.dtone.ssm.service.ISicknessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 病害接口实现类
 * @data 2020/10/24 15:46
 */

@Service
@Transactional //申明式事务管理
public class SicknessServiceImp implements ISicknessService {
    @Autowired
    private ISicknessDao sicknessDao;

    @Override
    public List<SicknessEntity> findAllSickness() {
        List<SicknessEntity> allSickness = sicknessDao.selectAllSickness();
        return allSickness;
    }

    @Override
    public List<SicknessEntity> findSicknessByVague(String name, String pattern) {
        List<SicknessEntity> sicknessByVague = sicknessDao.selectSicknessByVague(name,pattern);
        return sicknessByVague;
    }
}
