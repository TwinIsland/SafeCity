package com.dtone.ssm.dao;

import com.dtone.ssm.entity.LogEntity;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @author 周垣枳
 * @desc 日志功能映射器接口
 * @data 2020/10/23 9:59
 */
@Mapper
public interface ILogDao {

    @Select("select * from tb_log")
    @Results(value = {
            @Result(property = "id", column = "lg_id", id = true),
            @Result(property = "content", column = "lg_content"),
            @Result(property = "date", column = "lg_time"),
    })
    //显示登录日志信息
    public List<LogEntity> selectAllLog();

    @Select("select * from tb_log where lg_time > #{date1} and time < #{date2}")
    @Results(value = {
            @Result(property = "id", column = "lg_id", id = true),
            @Result(property = "content", column = "lg_content"),
            @Result(property = "date", column = "lg_time"),
    })
    //根据日期区间查询用户登录信息
    public List<LogEntity> selectLogByDate(@Param("date1") Date date1,@Param("date2") Date date2);

    @Insert("insert into tb_log (lg_id,lg_content,lg_time) values (null,#{content},#{date})")
    //添加日志信息
    public void insertLog(String content, Date date);

}
