package com.dtone.ssm.controller;

import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.IExpertService;
import com.dtone.ssm.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  11:07
 * @desc
 */
@RestController
@Slf4j  //获取日志对象
public class ExpertController
{
        @Autowired
        private IExpertService iExpertService;
        @RequestMapping("info/expert")
        public List<ExpertEntity> getExpert() {
            log.info("收到请求:info/expert");
            List<ExpertEntity> expertEntities = iExpertService.selectAllExpert();
            log.info("返回对象");
            return expertEntities;
        }



}
