package com.dtone.ssm.controller;

import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.entity.MouseEntity;
import com.dtone.ssm.service.IBugService;
import com.dtone.ssm.service.IMouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/27 16:25
 */
@RestController
@Slf4j //获取日志对象
public class MouseController {
    @Autowired
    private IMouseService mouseService;



    @RequestMapping("user/mouse")
    public List<MouseEntity> getMouse() {
        List<MouseEntity> mouseEntities = mouseService.findAllMouse();
        return mouseEntities;
    }
}
