/**
 * @program: safecity
 * @description: takelist service
 * @author: TwinIsland
 * @create: 2020-10-28 16:07
 **/

package com.dtone.ssm.service.imp;

import com.dtone.ssm.dao.ITakelistDao;
import com.dtone.ssm.entity.TakeListEntity;
import com.dtone.ssm.service.ITakeListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional //申明式事务管理
public class TakeListServiceImp implements ITakeListService {

    @Autowired
    private ITakelistDao takelistDao;

    @Override
    public List<TakeListEntity> selectAllTakeList() {
        return takelistDao.selectAllTakeList();
    }


    @Override
    public List<TakeListEntity> searchTakeList(String sDate,String eDate,String name) {
        return takelistDao.searchSpecTakeList(sDate,eDate,name);
    }

    @Override
    public void addTakeList(String date, String name, String team, int medID, int count) {
        takelistDao.insertTakeList(date,name,team,medID,count);
    }

    @Override
    public List<TakeListEntity> selectTakeListById(int id) {
        return takelistDao.selectTakeListById(id);
    }
}

