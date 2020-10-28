package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IMedicamentDao;
import com.dtone.ssm.entity.MedicamentEntity;
import com.dtone.ssm.entity.RecordEntity;
import com.dtone.ssm.service.IMedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  9:55
 * @desc
 */
@Service
@Transactional //申明式事务管理
public class MedicamentServiceImp implements IMedicamentService {

    @Autowired
    private IMedicamentDao medicamentDao;

    @Override
    public List<MedicamentEntity> findAllMedi()
    {
        return medicamentDao.selectAllMedi();

    }

    @Override
    public List<MedicamentEntity> findMediBynameAndptypeAndtype(String med_name, String med_ptype, String med_type)
    {
        return medicamentDao.selectMediBynameAndptypeAndtype(med_name,med_ptype,med_type);

    }

    @Override
    public int addMedi(MedicamentEntity medicamentEntity)
    {
        return medicamentDao.insertMedi(medicamentEntity);
    }

    @Override
    public void delMediByID(int med_id)
    {
        medicamentDao.deleteMediByID(med_id);
    }

    @Override
    public List<MedicamentEntity> getMedByRecId(int id) {
        return medicamentDao.getMedInfoByRecId(id);
    }

    @Override
    public int getCountById(int id) {
        return medicamentDao.getCountById(id).get(0);
    }

    @Override
    public void updateCount(int id, int count) {
        medicamentDao.updateCount(id,count);
    }
}
