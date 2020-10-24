package com.dtone.ssm.dao;

import com.dtone.ssm.entity.TeamEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/23 17:32
 */
@Mapper
public interface ITeamDao {
    @Select("select * from tb_team")
    @Results(value = {
            @Result(property = "id",column = "tm_id",id=true),
            @Result(property = "name",column = "tm_name"),
            @Result(property = "peo",column = "tm_peo"),
            @Result(property = "tel",column = "tm_tel"),
            @Result(property = "area",column = "tm_area"),
            @Result(property = "num",column = "tm_num"),
            @Result(property = "date",column = "tm_date"),
    })
    //查询所有小班信息
    public List<TeamEntity> selectAllTeam();

    @Select("select * from tb_team where tm_name like '%${name}%' and tm_area like '%${area}%'")
    @Results(value = {
            @Result(property = "id",column = "tm_id",id=true),
            @Result(property = "name",column = "tm_name"),
            @Result(property = "peo",column = "tm_peo"),
            @Result(property = "tel",column = "tm_tel"),
            @Result(property = "area",column = "tm_area"),
            @Result(property = "num",column = "tm_num"),
            @Result(property = "date",column = "tm_date"),
    })
    //模糊查询小班信息
    public List<TeamEntity> selectTeamByVague(@Param("name") String name, @Param("area") String area);

    @Update("update tb_team set tm_peo = #{peo},tm_tel = #{tel} where tm_id = #{id}")
    //修改负责人姓名和电话
    public void updateTeam(@Param("peo") String peo, @Param("tel") String tel, @Param("id") int id);

    @Insert("insert into tb_team (tm_id,tm_name,tm_peo,tm_tel,tm_area,tm_num,tm_date) values (null,#{name},#{peo},#{tel},#{area},#{num},#{date})")
    //添加小班信息
    public void insertTeam(TeamEntity teamEntity);

    //查询详细小班信息
    public List<TeamEntity> selectTeamDetailed();


}
