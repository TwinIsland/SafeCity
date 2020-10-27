package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IMedicamentDao;
import com.dtone.ssm.entity.MedicamentEntity;
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
public class MedecamentServiceImp implements IMedicamentService
{
    @Autowired
   private IMedicamentDao iMedicamentDao;

    @Override
    public List<MedicamentEntity> findAllMedi()
    {
        List<MedicamentEntity> medicamentEntities = iMedicamentDao.selectAllMedi();
        return medicamentEntities;

    }

    @Override
    public List<MedicamentEntity> findMediBynameAndptypeAndtype(String med_name, String med_ptype, String med_type)
    {
        List<MedicamentEntity> medicamentEntities = iMedicamentDao.selectMediBynameAndptypeAndtype(med_name,med_ptype,med_type);
        return medicamentEntities;

    }

    @Override
    public int addMedi(MedicamentEntity medicamentEntity)
    {
        int i = iMedicamentDao.insertMedi(medicamentEntity);
        return i;
    }

    @Override
    public void delMediByID(int med_id)
    {
        iMedicamentDao.deleteMediByID(med_id);
    }
}
