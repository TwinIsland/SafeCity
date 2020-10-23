package com.dtone.ssm;

import com.dtone.ssm.dao.IMedicamentDao;
import com.dtone.ssm.entity.MedicamentEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/23  18:06
 * @desc
 */
@SpringBootTest
public class MedicamentTest
{

    //以下测试药剂管理
    @Autowired
    private IMedicamentDao iMedicamentDao;

    @Test
    void selectAllMediTest()
    {
        List<MedicamentEntity> medicamentEntities = iMedicamentDao.selectAllMedi();
        //断言
        Assert.notNull(medicamentEntities);
    }

    @Test
    void selectMediBynameAndptypeAndtypeTest()
    {
        List<MedicamentEntity> medicamentEntities = iMedicamentDao.selectMediBynameAndptypeAndtype("油", "虫", "药");
        Assert.notNull(medicamentEntities);
    }

    @Test
    void insertMediTest()
    {
        MedicamentEntity medicamentEntity = new MedicamentEntity();
        medicamentEntity.setMed_name("测试");
        medicamentEntity.setMed_count(10000);
        medicamentEntity.setMed_ptype("鸡圈子测试");
        medicamentEntity.setMed_type("鸡测试");
        medicamentEntity.setMed_purpose("测试");
        iMedicamentDao.insertMedi(medicamentEntity);


    }

    @Test
    void deleteMediByIDTest()
    {
        iMedicamentDao.deleteMediByID(6);
    }
}
