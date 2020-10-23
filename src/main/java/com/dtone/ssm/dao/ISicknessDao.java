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
            @Result(property = "breed", column = "sk_cause"),
            @Result(property = "host", column = "sk_pattern"),
            @Result(property = "enemy", column = "sk_law"),
            @Result(property = "damage", column = "sk_damange"),
            @Result(property = "prevent", column = "sk_treat"),
            @Result(property = "larva", column = "sk_img"),
    })
    //查询所有病害
    public List<SicknessEntity> selectAllSickness();

    @Select("select * from tb_sickness where sk_name like '%',#{name},'%' and sk_pattern like '%',#{pattern},'%'")
    @Results(value = {
            @Result(property = "id", column = "sk_id", id = true),
            @Result(property = "name", column = "sk_name"),
            @Result(property = "breed", column = "sk_cause"),
            @Result(property = "host", column = "sk_pattern"),
            @Result(property = "enemy", column = "sk_law"),
            @Result(property = "damage", column = "sk_damange"),
            @Result(property = "prevent", column = "sk_treat"),
            @Result(property = "larva", column = "sk_img"),
    })
    //模糊查询病害
    public List<SicknessEntity> selectSicknessByVague(@Param("name") String name, @Param("pattern") String pattern);

}
