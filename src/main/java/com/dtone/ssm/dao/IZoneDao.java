package com.dtone.ssm.dao;

import com.dtone.ssm.entity.ZoneEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/23 17:16
 */
@Mapper
public interface IZoneDao {
    @Select("select * from tb_zone")
    @Results(value = {
            @Result(property = "id",column = "zo_id",id=true),
            @Result(property = "tree",column = "zo_tree"),
            @Result(property = "area",column = "zo_area"),
            @Result(property = "forest",column = "zo_ftype"),
            @Result(property = "team",column = "zo_team"),
            @Result(property = "land",column = "zo_stype"),
    })
    //查询所有区域信息
    public List<ZoneEntity> selectAllZone();

    @Select("select * from tb_zone where zo_area like '%${area}%' and zo_ftype like '%${forest}%' and zo_team like '%${team}%'")
    @Results(value = {
            @Result(property = "id",column = "zo_id",id=true),
            @Result(property = "tree",column = "zo_tree"),
            @Result(property = "area",column = "zo_area"),
            @Result(property = "forest",column = "zo_ftype"),
            @Result(property = "team",column = "zo_team"),
            @Result(property = "land",column = "zo_stype"),
    })
    //模糊查询区域一览
    public List<ZoneEntity> selectZoneByVague(@Param("area") String area, @Param("forest") String forest, @Param("team") String team);

    @Insert("insert into tb_zone values (null,#{area},#{forest},#{land},#{tree},#{team})")
    //添加区域一览信息
    public void insertZone(ZoneEntity zoneEntity);

}
