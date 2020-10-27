package com.dtone.ssm.service;

import com.dtone.ssm.entity.ZoneEntity;

import java.util.List;

/**
 * @author Yang
 * @desc 区域业务逻辑接口
 * @date 2020/10/24 20:19
 */
public interface IZoneService {
    //模糊查询区域信息
    public List<ZoneEntity> selectPartZone(String area,String forest,String team);

    public List<ZoneEntity> selectAllZone();

    //添加区域
    public void addZone(ZoneEntity zoneEntity);
}
