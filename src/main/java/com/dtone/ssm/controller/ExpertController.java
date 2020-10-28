package com.dtone.ssm.controller;

import com.dtone.ssm.entity.BugEntity;
import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.IExpertService;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IUserService;
import com.dtone.ssm.util.TimeUtil;
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
@RequestMapping("html/")
@Slf4j  //获取日志对象
public class ExpertController
{
    @Autowired
    private IExpertService iExpertService;
    @Autowired
    private ILogService logService;

    @RequestMapping("info/expert")
    public List<ExpertEntity> getExpert()
    {
        log.info("收到请求:info/expert");
        List<ExpertEntity> expertEntities = iExpertService.selectAllExpert();
        log.info("返回对象");
        return expertEntities;
    }

    @RequestMapping("info/searchedExpert")
    public List<ExpertEntity> getSearchedExpert(String name, String expertise, String company)
    {
        log.info("收到请求:info/searchedExpert");

        List<ExpertEntity> expertEntities = iExpertService.searchExpert(name, expertise, company);
        log.info("返回对象2");
        return expertEntities;
    }
    @RequestMapping("manage/addExpert.action")
    public String addExpert(ExpertEntity expertEntity)
    {
        if (expertEntity.getName().equals("") || expertEntity.getCompany().equals("") || expertEntity.getExpertise().equals("") || expertEntity.getPost().equals("") || expertEntity.getPhone().equals(""))
        {
            logService.userLogin("增加专家：" + expertEntity.getId(),TimeUtil.getCurTime() + " 【状态：失败】");
            return "false";
        }
        iExpertService.addExpert(expertEntity);
        logService.userLogin("增加专家：" + expertEntity.getId(),TimeUtil.getCurTime() + " 【状态：成功】");
        return "true";
    }
}
