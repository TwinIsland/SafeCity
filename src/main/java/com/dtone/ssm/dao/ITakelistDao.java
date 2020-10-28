/**
 * @program: safecity
 * @description: takelist dao
 * @author: TwinIsland
 * @create: 2020-10-28 16:16
 **/

package com.dtone.ssm.dao;

import com.dtone.ssm.entity.TakeListEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ITakelistDao {

    @Select(" select take_id,take_date,take_name,take_team,take_count,med_name,med_ptype,med_type from tb_takelist t,tb_medicament m where t.take_med_id = m.med_id")
    @Results(value = {
            @Result(property = "id", column = "take_id", id = true),
            @Result(property = "date", column = "take_date"),
            @Result(property = "name", column = "take_name"),
            @Result(property = "team", column = "take_team"),
            @Result(property = "count", column = "take_count"),
            @Result(property = "medName", column = "med_name"),
            @Result(property = "medPType", column = "med_ptype"),
            @Result(property = "medType", column = "med_type"),
    })
    public List<TakeListEntity> selectAllTakeList();


    @Select("select take_id,take_date,take_name,take_team,take_count,med_name,med_ptype,med_type from tb_takelist t,tb_medicament m " +
            "where t.take_med_id = m.med_id and t.take_date > #{sDate} " +
            "and t.take_date < #{eDate} " +
            "and t.take_name like concat('%',#{name},'%')")
    @Results(value = {
            @Result(property = "id", column = "take_id", id = true),
            @Result(property = "date", column = "take_date"),
            @Result(property = "name", column = "take_name"),
            @Result(property = "team", column = "take_team"),
            @Result(property = "count", column = "take_count"),
            @Result(property = "medName", column = "med_name"),
            @Result(property = "medPType", column = "med_ptype"),
            @Result(property = "medType", column = "med_type"),
    })
    public List<TakeListEntity> searchSpecTakeList(@Param("sDate") String sDate, @Param("eDate") String eDate, @Param("name") String name);


    @Select("insert into tb_takelist values(null,#{date},#{name},#{team},#{medID},#{count})")
    public void insertTakeList(@Param("date") String date, @Param("name") String name, @Param("team") String team, @Param("medID") int medID, @Param("count") int count);

    @Select(" select take_id,take_date,take_name,take_team,take_count,med_name,med_ptype,med_type from tb_takelist t,tb_medicament m where t.take_med_id = m.med_id and t.take_id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "take_id", id = true),
            @Result(property = "date", column = "take_date"),
            @Result(property = "name", column = "take_name"),
            @Result(property = "team", column = "take_team"),
            @Result(property = "count", column = "take_count"),
            @Result(property = "medName", column = "med_name"),
            @Result(property = "medPType", column = "med_ptype"),
            @Result(property = "medType", column = "med_type"),
    })
    public List<TakeListEntity> selectTakeListById(int id);


}

