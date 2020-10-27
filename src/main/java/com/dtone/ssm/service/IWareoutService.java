package com.dtone.ssm.service;

import com.dtone.ssm.entity.WareoutEntity;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  9:50
 * @desc
 */
public interface IWareoutService
{
    //    查询：出库管理可以显示药剂器械的已出库的基本信息
    public List<WareoutEntity> findAllWareout();

    //模糊查询：出库管理也可以通过起始日期、结束日期和出库人模糊查询出库基本信息。
    public List<WareoutEntity> findWOutByDateAndPerson(Date date, String out_person);

    //等待完成联表查询：选择一条出库基本信息后，可以查看出库的具体领用相关详细信息

    //添加新的出库信息到表中
    public int addWareout(WareoutEntity wareoutEntity);

    //根据id删除药剂管理记录
    public void deleWoutByID(int out_id);
}
