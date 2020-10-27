package com.dtone.ssm.dao;

import com.dtone.ssm.entity.MedicamentEntity;
import com.dtone.ssm.entity.RecordEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author mac
 * @date 2020/10/27  18:39
 * @desc
 */
@Mapper
public interface IRecordDao
{
    //查询所有
    @Select("select * from tb_record")
    @Results(value = {
            @Result(property = "id",column = "rec_id",id=true),
            @Result(property = "date",column = "rec_date"),
            @Result(property = "person",column = "rec_person"),
            @Result(property = "result",column = "rec_result"),

    })
    public List<RecordEntity> selectAllRecord();

    //添加
    @Insert("INSERT into tb_record(rec_date,rec_person,rec_result) VALUES(null,#{date},#{person},#{result})")
    public int insertRecord(RecordEntity recordEntity);

    //根据id删除药剂管理记录
    @Delete("delete from tb_record where rec_id = #{id}")
    public void deleteRecordByID(int id);
}
