package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.ILogDao;
import com.dtone.ssm.entity.LogEntity;
import com.dtone.ssm.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 周垣枳
 * @desc Log业务逻辑接口实现类
 * @data 2020/10/24 13:17
 */
@Service
@Transactional //申明式事务管理
public class LogServiceImp implements ILogService {
    @Autowired
    private ILogDao logDao;

    @Override
    public List<LogEntity> showAllLog() {
        List<LogEntity> allLog = logDao.selectAllLog();
        return allLog;
    }

    @Override
    public void userLogin(String content,Date date) {
        logDao.insertLog(content,date);

    }

    @Override
    public List<LogEntity> showLogByDate(Date startDate, Date endDate) {
        List<LogEntity> log = logDao.selectLogByDate(startDate,endDate);
        return log;
    }
}
