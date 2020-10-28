package com.dtone.ssm;

import com.dtone.ssm.dao.ITeamDao;
import com.dtone.ssm.dao.IZoneDao;
import com.dtone.ssm.entity.TeamEntity;
import com.dtone.ssm.entity.ZoneEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author Yang
 * @desc
 * @date 2020/10/24 19:13
 */
@SpringBootTest
public class SsmApplicationLyTests {
    @Autowired
    private IZoneDao zoneDao;
    @Autowired
    private ITeamDao teamDao;


    @Test
    void selectAllZoneTest(){
        List<ZoneEntity> zoneEntities = zoneDao.selectAllZone();
        Assert.notNull(zoneEntities);
        System.out.println(zoneEntities);
    }

    @Test
    void selectZoneByVagueTest(){
        List<ZoneEntity> zoneEntities = zoneDao.selectZoneByVague("雅林一号地区",null,null);
        Assert.notNull(zoneEntities);
        System.out.println(zoneEntities);
    }


    @Test
    void selectAllTeamTest(){
        List<TeamEntity> teamEntities = teamDao.selectAllTeam();
        Assert.notNull(teamEntities);
        System.out.println(teamEntities);
    }

    @Test
    void selectTeamByVagueTest(){
        List<TeamEntity> teamEntities = teamDao.selectTeamByVague("雅林一班",null);
        Assert.notNull(teamEntities);
        System.out.println(teamEntities);
    }


}
