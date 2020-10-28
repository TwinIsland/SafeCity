package com.dtone.ssm.service;

import com.dtone.ssm.entity.MouseEntity;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 鼠害业务逻辑接口
 * @data 2020/10/24 15:50
 */
public interface IMouseService {
    //得到所有鼠害
    public List<MouseEntity> findAllMouse();

    //模糊查询鼠害
    public List<MouseEntity> findMouseByVague(String name);

    //查询鼠害详情
    public MouseEntity findMouseByName(String name);
}
