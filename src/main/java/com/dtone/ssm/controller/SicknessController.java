package com.dtone.ssm.controller;

import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.entity.SicknessEntity;
import com.dtone.ssm.service.ISicknessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/27 15:01
 */
@RestController
@Slf4j //获取日志对象
public class SicknessController {
    @Autowired
    private ISicknessService sicknessService;



    @RequestMapping("user/sickness")
    public List<SicknessEntity> getSickness() {
        log.info("收到请求:user/sickness");
        List<SicknessEntity> sicknessEntities = sicknessService.findAllSickness();
        log.info("返回对象");
        return sicknessEntities;
    }

    @RequestMapping("user/findsickness")
    public SicknessEntity getName(String sicknessName){
        log.info("收到请求：user/user/findsickness="+sicknessName);
        SicknessEntity sicknessEntity = sicknessService.findSicknessByName(sicknessName);
        log.info("响应请求：user/user/findsickness=" + sicknessEntity);
        return sicknessEntity;
    }

    @RequestMapping("info/searchedSickness")
    public List<SicknessEntity> getSearchedBug(String name, String pattern) {
        log.info("收到请求：info/searchedSickness,name="+name +"pattern=" + pattern);
        List<SicknessEntity> sicknessEntities = sicknessService.findSicknessByVague(name,pattern);
        log.info("收到请求：info/searchedSickness,sicknessEntities="+sicknessEntities);
        return sicknessEntities;
    }
}
