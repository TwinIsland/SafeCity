package com.dtone.ssm.controller;

import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.service.IBugService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/27 11:03
 */
@RestController
@RequestMapping("html/")
@Slf4j //获取日志对象
public class BugController {
    @Autowired
    private IBugService bugService;



    @RequestMapping("info/bug")
    public List<BugEntity> getBug() {
        List<BugEntity> bugEntities = bugService.findAllBug();
        return bugEntities;
    }
}
