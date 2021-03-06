package com.dtone.ssm.controller;

import com.dtone.ssm.dao.IRecordDao;
import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.entity.RecordEntity;
import com.dtone.ssm.service.IExpertService;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  18:54
 * @desc
 */
@RestController
@RequestMapping("html/")
@Slf4j  //获取日志对象
public class RecordController
{
    @Autowired
    private IRecordService iRecordService;
    @Autowired
    private ILogService logService;

    @RequestMapping("info/record")
    public List<RecordEntity> getRecord()
    {
        log.info("收到请求:info/record");
        List<RecordEntity> allRecord = iRecordService.findAllRecord();
        log.info("返回对象");
        return allRecord;
    }

    @RequestMapping("manage/addRecord.action")
    public String addRecord(RecordEntity recordEntity)
    {
        if (recordEntity.getDate().equals("") || recordEntity.getPerson().equals("") || recordEntity.getResult().equals(""))
        {
            return "false";
        }
        iRecordService.addRecord(recordEntity);
        return "true";

    }
}
