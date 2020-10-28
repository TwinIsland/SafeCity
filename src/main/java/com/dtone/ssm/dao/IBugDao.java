package com.dtone.ssm.dao;

import com.dtone.ssm.entity.BugEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 害虫管理映射接口
 * @data 2020/10/23 11:38
 */
@Mapper
public interface IBugDao {
    @Select("select * from tb_bug")
    @Results(value = {
            @Result(property = "id", column = "bg_id", id = true),
            @Result(property = "name", column = "bg_name"),
            @Result(property = "breed", column = "bg_breed"),
            @Result(property = "host", column = "bg_host"),
            @Result(property = "enemy", column = "bg_enemy"),
            @Result(property = "damage", column = "bg_damage"),
            @Result(property = "prevent", column = "bg_prevent"),
            @Result(property = "larva", column = "bg_img_s"),
            @Result(property = "adult", column = "bg_img_l"),
    })
    //显示所有虫害信息
    public List<BugEntity> selectAllBug();

    @Select("select * from tb_bug where bg_name like '%${name}%' and bg_host like '%${host}%'")
    @Results(value = {
            @Result(property = "id", column = "bg_id", id = true),
            @Result(property = "name", column = "bg_name"),
            @Result(property = "breed", column = "bg_breed"),
            @Result(property = "host", column = "bg_host"),
            @Result(property = "enemy", column = "bg_enemy"),
            @Result(property = "damage", column = "bg_damage"),
            @Result(property = "prevent", column = "bg_prevent"),
            @Result(property = "larva", column = "bg_img_s"),
            @Result(property = "adult", column = "bg_img_l"),
    })
    //模糊查询虫害信息
    public List<BugEntity> selectBugByVague(@Param("name") String name, @Param("host") String host);

    @Select("select * from tb_bug where bg_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "bg_id", id = true),
            @Result(property = "name", column = "bg_name"),
            @Result(property = "breed", column = "bg_breed"),
            @Result(property = "host", column = "bg_host"),
            @Result(property = "enemy", column = "bg_enemy"),
            @Result(property = "damage", column = "bg_damage"),
            @Result(property = "prevent", column = "bg_prevent"),
            @Result(property = "larva", column = "bg_img_s"),
            @Result(property = "adult", column = "bg_img_l"),
    })
    //根据名字查询虫害
    public BugEntity selectBugByName(@Param("name") String name);



}
