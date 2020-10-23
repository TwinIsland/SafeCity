package com.dtone.ssm.dao;

import com.dtone.ssm.entity.EventEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface IEventDao {
    //选择所有事件
    @Select("select * from tb_event")
    @Results(value={
            @Result(property = "id", column = "ev_id", id = true),
            @Result(property = "name", column = "ev_name"),
            @Result(property = "date", column = "ev_date"),
            @Result(property = "status", column = "ev_status"),
            @Result(property = "img", column = "ev_img"),
            @Result(property = "desc", column = "ev_desc"),
            @Result(property = "find", column = "ev_find"),
            @Result(property = "type", column = "ev_type"),
            @Result(property = "team", column = "ev_team"),
            @Result(property = "loss", column = "ev_loss"),
            @Result(property = "area", column = "ev_area"),
            @Result(property = "suggestion", column = "ev_suggestion"),
            @Result(property = "suggestion_p", column = "ev_suggestion_p"),
    })
    public List<EventEntity> selectAllEvent();


    @Select("select * from tb_event where Date(ev_date) between #{dStart} and #{dEnd} and ev_name like CONCAT('%',#{name},'%')")
    @Results(value={
            @Result(property = "id", column = "ev_id", id = true),
            @Result(property = "name", column = "ev_name"),
            @Result(property = "date", column = "ev_date"),
            @Result(property = "status", column = "ev_status"),
            @Result(property = "img", column = "ev_img"),
            @Result(property = "desc", column = "ev_desc"),
            @Result(property = "find", column = "ev_find"),
            @Result(property = "type", column = "ev_type"),
            @Result(property = "team", column = "ev_team"),
            @Result(property = "loss", column = "ev_loss"),
            @Result(property = "area", column = "ev_area"),
            @Result(property = "suggestion", column = "ev_suggestion"),
            @Result(property = "suggestion_p", column = "ev_suggestion_p"),
    })
    //模糊查询事件
    public List<EventEntity> selectEvent(@Param("name") String name, @Param("dStart") String dStart,@Param("dEnd") String dEnd);

    @Insert("insert into tb_event values " +
            "(null,#{name},#{date},#{status},#{img},#{desc},#{find},#{type},#{team},#{loss},#{area},#{suggestion},null)")
    //增加事件
    public void insertEvent(EventEntity eventEntity);

    @Insert("insert into tb_event (ev_suggestion_p) values(#{suggestion_p} where id=#{id})")
    //增加专家建议
    public void insertPSuggestion(@Param("suggestion_P") String suggestion_p, int id);

    @Delete("delete from tb_event where id=#{id}")
    //删除事件
    public void deleteEvent(int id);
}
