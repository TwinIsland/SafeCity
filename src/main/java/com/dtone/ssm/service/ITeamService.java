package com.dtone.ssm.service;

import com.dtone.ssm.entity.TeamEntity;

import java.util.List;

/**
 * @author Yang
 * @desc 小班业务逻辑接口
 * @date 2020/10/24 20:38
 */
public interface ITeamService {
    //模糊查询小班信息
    public List<TeamEntity> selectPartTeam(String team, String area);
    //查看小班详细信息
    public List<TeamEntity> selectTeamInfo();
    public TeamEntity selectTeamById(int id);

}
