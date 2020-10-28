package com.dtone.ssm.service;

import com.dtone.ssm.entity.BugEntity;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 虫害业务逻辑接口
 * @data 2020/10/24 15:35
 */
public interface IBugService {
    //得到所有虫害信息
    public List<BugEntity> findAllBug();

    //模糊查询虫害信息
    public List<BugEntity> findBugByVague(String name, String host);

    //根据虫名查询
    public BugEntity findBugByName(String name);
}
