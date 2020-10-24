package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.IZoneDao;
import com.dtone.ssm.entity.ZoneEntity;
import com.dtone.ssm.service.IZoneService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Yang
 * @desc 区域业务逻辑接口实现类
 * @date 2020/10/24 20:26
 */
@Service
@Transactional
public class ZoneServiceImp implements IZoneService {
    @Autowired
    private IZoneDao zoneDao;
    @Override
    public List<ZoneEntity> selectPartZone(String name, String tree, String team) {
        List<ZoneEntity> zoneEntities = zoneDao.selectZoneByVague(null,null,null);
        return zoneEntities;
    }

    @Override
    public void addZone(ZoneEntity zoneEntity) {
        zoneDao.insertZone(zoneEntity);
    }
}
