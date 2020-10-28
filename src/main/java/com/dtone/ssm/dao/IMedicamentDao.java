package com.dtone.ssm.dao;

import com.dtone.ssm.entity.MedicamentEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/23  11:53
 * @desc
 */
@Mapper //扫描映射器接口
@Repository
public interface IMedicamentDao
{
    //查询所有药剂信息
    @Select("select * from tb_medicament")
    @Results(value = {
            @Result(property = "med_id",column = "med_id",id=true),
            @Result(property = "med_name",column = "med_name"),
            @Result(property = "med_ptype",column = "med_ptype"),
            @Result(property = "med_type",column = "med_type"),
            @Result(property = "med_purpose",column = "med_purpose"),
            @Result(property = "med_count",column = "med_count")
    })
    public List<MedicamentEntity> selectAllMedi();

    @Select("select med_count from tb_medicament where med_id = #{id}")
    public List<Integer> getCountById(int id);

    @Update("update tb_medicament set med_count = #{newCount} where med_id = #{medId}")
    public void updateCount(@Param("medId") int medId,@Param("newCount") int newCount);

    //药剂器械管理可以通过名称、防治类型和类别模糊查询药剂器械。
    @Select("select * from tb_medicament where med_name like concat('%',#{med_name},'%') and " +
            "med_ptype = #{med_ptype} and med_type = #{med_type}")
    public List<MedicamentEntity> selectMediBynameAndptypeAndtype(@Param("med_name") String med_name, @Param("med_ptype") String med_ptype, @Param("med_type") String med_type);
    //药剂器械管理可以添加新的药剂器械到库存中（即入库）
    @Insert("INSERT into tb_medicament(med_name,med_ptype,med_type,med_purpose,med_count) VALUES(#{med_name},#{med_ptype},#{med_type},#{med_purpose},#{med_count})")
    public int insertMedi(MedicamentEntity medicamentEntity);

    //根据id删除药剂管理记录
    @Delete("delete from tb_medicament where med_id = #{med_id}")
    public void deleteMediByID(int med_id);

    //根据record id 查药品信息
    @Select("Select * from tb_medicament where med_id = (select rec_medId from tb_record where rec_id = #{id})")
    public List<MedicamentEntity> getMedInfoByRecId(int id);
}
