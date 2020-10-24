package com.dtone.ssm.dao;

import com.dtone.ssm.entity.MouseEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 鼠害映射接口
 * @data 2020/10/23 14:26
 */
@Mapper
public interface IMouseDao {
    @Select("select * from tb_mouse")
    @Results(value = {
            @Result(property = "id", column = "ms_id", id = true),
            @Result(property = "name", column = "ms_name"),
            @Result(property = "breed", column = "ms_breed"),
            @Result(property = "food", column = "ms_food"),
            @Result(property = "enemy", column = "ms_enemy"),
            @Result(property = "damage", column = "ms_damage"),
            @Result(property = "prevent", column = "ms_prevent"),
            @Result(property = "img", column = "ms_img"),
    })
    //查询所有鼠害信息
    public List<MouseEntity> selectAllMouse();

    @Select("select * from tb_mouse where ms_name like '%${name}%'")
    @Results(value = {
            @Result(property = "id", column = "ms_id", id = true),
            @Result(property = "name", column = "ms_name"),
            @Result(property = "breed", column = "ms_breed"),
            @Result(property = "food", column = "ms_food"),
            @Result(property = "enemy", column = "ms_enemy"),
            @Result(property = "damage", column = "ms_damage"),
            @Result(property = "prevent", column = "ms_prevent"),
            @Result(property = "img", column = "ms_img"),
    })
    //模糊查询鼠害信息
    public List<MouseEntity> selectMouseByVague(@Param("name") String name);
}
