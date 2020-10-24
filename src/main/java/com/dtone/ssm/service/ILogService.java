package com.dtone.ssm.service;

import com.dtone.ssm.entity.LogEntity;

import java.util.Date;
import java.util.List;

/**
 * @author 周垣枳
 * @desc log业务逻辑接口
 * @data 2020/10/24 11:51
 */
public interface ILogService {
    //得到所有日志信息
    public List<LogEntity> showAllLog();

    //用户登录，添加日志信息
    public void userLogin(String content,Date date);

    //查找用户登录信息
    public List<LogEntity> showLogByDate(Date startDate,Date endDate);



}
