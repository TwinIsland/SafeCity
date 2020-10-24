package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.ITeamDao;
import com.dtone.ssm.entity.TeamEntity;
import com.dtone.ssm.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Yang
 * @desc 小班业务逻辑接口实现类
 * @date 2020/10/24 20:56
 */
@Service
@Transactional
public class TeamServiceImp implements ITeamService {
     @Autowired
    private ITeamDao teamDao;
    @Override
    public List<TeamEntity> selectPartTeam(String name, String area) {
        List<TeamEntity> teamEntities = teamDao.selectTeamByVague(null,null);
        return teamEntities;
    }

    @Override
    public List<TeamEntity> selectTeamInfo() {
        List<TeamEntity> teamEntities = teamDao.selectTeamDetailed();
        return teamEntities;
    }

    @Override
    public void updateNameAndTel(String peo, String tel, int id) {
        teamDao.updateTeam(null,null,1);
    }

    @Override
    public void addTeam(TeamEntity teamEntity) {
        teamDao.insertTeam(teamEntity);
    }
}
