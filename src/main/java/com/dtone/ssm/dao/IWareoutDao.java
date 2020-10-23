package com.dtone.ssm.dao;

import com.dtone.ssm.entity.WareoutEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @author mac
 * @date 2020/10/23  15:10
 * @desc /出库管理
 */
@Mapper
public interface IWareoutDao
{
//    查询：出库管理可以显示药剂器械的已出库的基本信息
    @Select("select * from tb_wareout")
    @Results(value = {
            @Result(property = "out_id",column = "out_id",id=true),
            @Result(property = "out_date",column = "out_date"),
            @Result(property = "out_class",column = "out_class"),
            @Result(property = "out_person",column = "out_person"),
    })
    public List<WareoutEntity> selectAllWareout();

    //模糊查询：出库管理也可以通过起始日期、结束日期和出库人模糊查询出库基本信息。
    @Select("<script>" +
            "select * from tb_wareout" +
            "<where>" +
            "date = #{date}"+
            "<if test='date != null' >" +
            "</if>" +
            "<if test='out_person != null' >" +
            "and out_person like concat('%', #{out_person},'%')" +
            "</if>" +
            "</where>" +
            "</script>")
    public List<WareoutEntity> selectWOutByDateAndPerson(@Param("date") Date date, @Param("out_person") String out_person);

    //等待完成联表查询：选择一条出库基本信息后，可以查看出库的具体领用相关详细信息





    //添加新的出库信息到表中
    @Insert("INSERT into tb_wareout(date,out_class,out_person) VALUES(#{date},#{out_class},#{out_person})")
    public int insertWareout(WareoutEntity wareoutEntity);

    //根据id删除药剂管理记录
    @Delete("delete from tb_wareout where out_id = #{out_id}")
    public void deleteWoutByID(int out_id);

}
