package com.dtone.ssm.service;

import com.dtone.ssm.entity.SicknessEntity;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 病害业务逻辑接口
 * @data 2020/10/24 15:44
 */
public interface ISicknessService {
    //得到所有病害
    public List<SicknessEntity> findAllSickness();

    //模糊查询得到病害
    public List<SicknessEntity> findSicknessByVague(String name, String pattern);

    //根据name获取详情
    public SicknessEntity findSicknessByName(String name);
}
