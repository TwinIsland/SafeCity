package com.dtone.ssm.controller;

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
}
