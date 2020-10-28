package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IExpertDao;
import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.service.IExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //申明式事务管理
public class ExpertServiceImp implements IExpertService {
    @Autowired
    IExpertDao expertDao;

    @Override
    public void addExpert(ExpertEntity expertEntity)
    {
        expertDao.insertExpert(expertEntity);
    }

    @Override
    public void delExpert(int id) {
        expertDao.deleteExpert(id);
    }

    @Override
    public List<ExpertEntity> searchExpert(String name, String expertise, String company) {
        List<ExpertEntity> expertEntities = expertDao.selectExpert(name, expertise, company);
        return expertEntities;
    }

    @Override
    public List<ExpertEntity> selectAllExpert() {
        List<ExpertEntity> expertEntities = expertDao.selectAllExpert();
        return  expertEntities;
    }
}
