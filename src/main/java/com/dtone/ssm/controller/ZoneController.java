/**
 * @program: safecity
 * @description: zone controller
 * @author: TwinIsland
 * @create: 2020-10-28 01:37
 **/

package com.dtone.ssm.controller;

import com.dtone.ssm.entity.ZoneEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IZoneService;
import com.dtone.ssm.service.imp.LogServiceImp;
import com.dtone.ssm.service.imp.ZoneServiceImp;
import com.dtone.ssm.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("html/")
public class ZoneController {
    @Autowired
    IZoneService zoneService;

    @Autowired
    ILogService logService;

    @RequestMapping("info/zone")
    public List<ZoneEntity> getAllZone() {
        return zoneService.selectAllZone();
    }

    @RequestMapping("info/searchedZone")
    public List<ZoneEntity> getSearchedZone(String area, String forest, String team) {
        return zoneService.selectPartZone(area, forest, team);
    }

    @RequestMapping("manage/addZone.action")
    public String addZone(String area, String forest, String land, String tree, String team) {
        if (area.equals("") || forest.equals("") || land.equals("") || tree.equals("") || team.equals("")) {
            logService.userLogin("插入区域数据：" + area + "【状态：失败】", TimeUtil.getCurTime());
            return "false";
        }
        logService.userLogin("插入区域数据：" + area + "【状态：成功】", TimeUtil.getCurTime());
        ZoneEntity zoneEntity = new ZoneEntity(114514, area, forest, land, tree, team);
        zoneService.addZone(zoneEntity);
        return tree;
    }
}

