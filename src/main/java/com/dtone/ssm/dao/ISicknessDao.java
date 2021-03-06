package com.dtone.ssm.dao;

import com.dtone.ssm.entity.SicknessEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 周垣枳
 * @desc 病害管理映射接口
 * @data 2020/10/23 14:03
 */
@Mapper
public interface ISicknessDao {

    @Select("select * from tb_sickness")
    @Results(value = {
            @Result(property = "id", column = "sk_id", id = true),
            @Result(property = "name", column = "sk_name"),
            @Result(property = "cause", column = "sk_cause"),
            @Result(property = "pattern", column = "sk_pattern"),
            @Result(property = "law", column = "sk_law"),
            @Result(property = "damange", column = "sk_damange"),
            @Result(property = "treat", column = "sk_treat"),
            @Result(property = "img", column = "sk_img"),
    })
    //查询所有病害
    public List<SicknessEntity> selectAllSickness();

    @Select("select * from tb_sickness where sk_name like '%${name}%' and sk_pattern like '%${pattern}%'")
    @Results(value = {
            @Result(property = "id", column = "sk_id", id = true),
            @Result(property = "name", column = "sk_name"),
            @Result(property = "cause", column = "sk_cause"),
            @Result(property = "pattern", column = "sk_pattern"),
            @Result(property = "law", column = "sk_law"),
            @Result(property = "damange", column = "sk_damange"),
            @Result(property = "treat", column = "sk_treat"),
            @Result(property = "img", column = "sk_img"),
    })
    //模糊查询病害
    public List<SicknessEntity> selectSicknessByVague(@Param("name") String name, @Param("pattern") String pattern);

    @Select("select * from tb_sickness where sk_name = #{name}")
    @Results(value = {
            @Result(property = "id", column = "sk_id", id = true),
            @Result(property = "name", column = "sk_name"),
            @Result(property = "cause", column = "sk_cause"),
            @Result(property = "pattern", column = "sk_pattern"),
            @Result(property = "law", column = "sk_law"),
            @Result(property = "damange", column = "sk_damange"),
            @Result(property = "treat", column = "sk_treat"),
            @Result(property = "img", column = "sk_img"),
    })
    //根据name查询详细信息
    public SicknessEntity selectSicknessByName(@Param("name") String name);


}
