/**
 * @program: safecity
 * @description: takelist controller
 * @author: TwinIsland
 * @create: 2020-10-28 17:10
 **/

package com.dtone.ssm.controller;

import com.dtone.ssm.entity.TakeListEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IMedicamentService;
import com.dtone.ssm.service.ITakeListService;
import com.dtone.ssm.service.imp.TakeListServiceImp;
import com.dtone.ssm.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j //获取日志对象
@RequestMapping("html/")
public class TakeListController {
    @Autowired
    private ITakeListService takeListService;
    @Autowired
    private IMedicamentService medicamentService;
    @Autowired
    private ILogService logService;

    @RequestMapping("info/takelist")
    public List<TakeListEntity> getTakeList(){
        return takeListService.selectAllTakeList();
    }

    @RequestMapping("info/searchedTakeList.action")
    public List<TakeListEntity> searchTakeList(String sDate,String eDate,String name){
        return takeListService.searchTakeList(sDate,eDate,name);
    }

    @RequestMapping("info/insertTakeList.action")
    public String insertTakeList(String name,String team,int count,int medID){
        if(medicamentService.getCountById(medID) <= count){
            logService.userLogin("插入申请信息：" + name + " 【状态：失败】",TimeUtil.getCurTime());
            return "insufficient";
        }
        try {
            takeListService.addTakeList(TimeUtil.getCurTime(), name, team, medID, count);
            medicamentService.updateCount(medID,medicamentService.getCountById(medID)-count);
            logService.userLogin("插入申请信息：" + name + " 【状态：成功】",TimeUtil.getCurTime());
            return "true";
        }catch (Exception e){
            logService.userLogin("插入申请信息：" + name + " 【状态：失败】",TimeUtil.getCurTime());
            return e.toString();
        }
    }

    @RequestMapping("info/takelistById.action")
    public TakeListEntity getInfoById(int id){
        log.info("获取资源：" + takeListService.selectTakeListById(id).toString());
        return takeListService.selectTakeListById(id).get(0);
    }
}

