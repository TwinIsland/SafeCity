/**
 * @program: safecity
 * @description: takelist imp
 * @author: TwinIsland
 * @create: 2020-10-28 16:04
 **/

package com.dtone.ssm.service;

import com.dtone.ssm.entity.TakeListEntity;

import java.util.List;

public interface ITakeListService {
    public List<TakeListEntity> selectAllTakeList();
    public List<TakeListEntity> searchTakeList(String sDate,String eDate,String name);
    public void addTakeList(String date,String name,String team,int medID,int count);
    public List<TakeListEntity> selectTakeListById(int id);
}

