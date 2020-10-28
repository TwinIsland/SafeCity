/**
 * @program: safecity
 * @description: 日志控制器
 * @author: TwinIsland
 * @create: 2020-10-27 16:37
 **/

package com.dtone.ssm.controller;

import com.dtone.ssm.entity.LogEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.imp.LogServiceImp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("html/")
@Slf4j  //获取日志对象
public class LogController {
    @Autowired
    ILogService logService;

    @RequestMapping("info/log")
    public List<LogEntity> getLog(){
        return logService.showAllLog();
    }

    @RequestMapping("info/newLog")
    public List<LogEntity> getSLog(String sDate, String eDate){
        return logService.showLogByDate(sDate,eDate);
    }
}

