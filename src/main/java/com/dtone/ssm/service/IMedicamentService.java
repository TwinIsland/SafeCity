package com.dtone.ssm.service;

import com.dtone.ssm.entity.MedicamentEntity;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/23  11:23
 * @desc
 */
public interface IMedicamentService
{
    //查询所有药剂信息
    public List<MedicamentEntity> findAllMedi();
    //药剂器械管理可以通过名称、防治类型和类别模糊查询药剂器械。
    public List<MedicamentEntity> findMediBynameAndptypeAndtype(String med_name,  String med_ptype, String med_type);
    //药剂器械管理可以添加新的药剂器械到库存中（即入库）
    public int addMedi(MedicamentEntity medicamentEntity);
    //根据id删除药剂管理记录
    public void delMediByID(int med_id);
}
