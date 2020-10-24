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
            @Result(property = "id",column = "zn_id",id=true),
            @Result(property = "name",column = "zn_name"),
            @Result(property = "tree",column = "zn_tree"),
            @Result(property = "area",column = "zn_area"),
            @Result(property = "better",column = "zn_better"),
            @Result(property = "team",column = "zn_team"),
    })
    //查询所有区域信息
    public List<ZoneEntity> selectAllZone();

    @Select("select * from tb_zone where zn_name like '%${name}%' and zn_tree like '%${tree}%' and zn_team like '%${team}%'")
    @Results(value = {
            @Result(property = "id",column = "zn_id",id=true),
            @Result(property = "name",column = "zn_name"),
            @Result(property = "tree",column = "zn_tree"),
            @Result(property = "area",column = "zn_area"),
            @Result(property = "better",column = "zn_better"),
            @Result(property = "team",column = "zn_team"),
    })
    //模糊查询区域一览
    public List<ZoneEntity> selectZoneByVague(@Param("name") String name, @Param("tree") String tree, @Param("team") String team);

    @Insert("insert into tb_zone (zn_id,zn_name,zn_tree,zn_area,zn_better,zn_team) values (null,#{name},#{tree},#{area},#{better},#{team})")
    //添加区域一览信息
    public void insertZone(ZoneEntity zoneEntity);

}
