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

    @Select("select * from tb_team t,tb_zone z where t.zo_id = z.zo_id")
    @Results(value = {
            @Result(property = "id",column = "tn_id",id=true),
            @Result(property = "name",column = "tn_name"),
            @Result(property = "zone",column = "zo_area"),
            @Result(property = "lType",column = "zo_stype"),
            @Result(property = "fType",column = "zo_ftype"),
            @Result(property = "tree",column = "zo_tree"),
            @Result(property = "num",column = "tn_num"),
            @Result(property = "tel",column = "tn_tel"),
            @Result(property = "date",column = "tn_date"),
            @Result(property = "team",column = "zo_team"),

    })
    public List<TeamEntity> selectAllTeam();


    @Select("select * from tb_team t,tb_zone z where t.zo_id = z.zo_id and z.zo_area like concat('%',#{zone},'%') and z.zo_team like concat('%',#{team},'%')")
    @Results(value = {
            @Result(property = "id",column = "tn_id",id=true),
            @Result(property = "name",column = "tn_name"),
            @Result(property = "zone",column = "zo_area"),
            @Result(property = "lType",column = "zo_stype"),
            @Result(property = "fType",column = "zo_ftype"),
            @Result(property = "tree",column = "zo_tree"),
            @Result(property = "num",column = "tn_num"),
            @Result(property = "tel",column = "tn_tel"),
            @Result(property = "date",column = "tn_date"),
            @Result(property = "team",column = "zo_team"),
    })
    public List<TeamEntity> selectTeamByVague(@Param("zone") String name,@Param("team") String team);


    @Select("select * from tb_team t,tb_zone z where t.zo_id = z.zo_id and t.tn_id = #{id}")
    @Results(value = {
            @Result(property = "id",column = "tn_id",id=true),
            @Result(property = "name",column = "tn_name"),
            @Result(property = "zone",column = "zo_area"),
            @Result(property = "lType",column = "zo_stype"),
            @Result(property = "fType",column = "zo_ftype"),
            @Result(property = "tree",column = "zo_tree"),
            @Result(property = "num",column = "tn_num"),
            @Result(property = "tel",column = "tn_tel"),
            @Result(property = "date",column = "tn_date"),
            @Result(property = "team",column = "zo_team"),
    })
    public TeamEntity selectTeamById(int id);

}
