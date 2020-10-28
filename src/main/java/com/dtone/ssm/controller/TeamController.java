/**
 * @program: safecity
 * @description: team控制器
 * @author: TwinIsland
 * @create: 2020-10-29 01:11
 **/

package com.dtone.ssm.controller;

import com.dtone.ssm.entity.TeamEntity;
import com.dtone.ssm.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("html/")
public class TeamController {
    @Autowired
    private ITeamService teamService;

    @RequestMapping("info/team")
    public List<TeamEntity> getTeam(){
        return teamService.selectTeamInfo();
    }

    @RequestMapping("info/searchedTeam")
    public List<TeamEntity> getTeam(String team,String area){
        return teamService.selectPartTeam(team,area);
    }

    @RequestMapping("info/getTeamById.action")
    public TeamEntity getTeamById(int id){
        return teamService.selectTeamById(id);
    }
}

