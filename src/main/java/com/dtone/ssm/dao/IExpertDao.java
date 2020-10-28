package com.dtone.ssm.dao;

import com.dtone.ssm.entity.ExpertEntity;
import com.dtone.ssm.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface IExpertDao {

    @Select("select * from tb_expert")
    @Results(value = {
            @Result(property = "id", column = "ex_id", id = true),
            @Result(property = "name", column = "ex_name"),
            @Result(property = "usrId", column = "ex_usrId"),
            @Result(property = "company", column = "ex_company"),
            @Result(property = "expertise", column = "ex_expertise"),
            @Result(property = "post", column = "ex_post"),
            @Result(property = "phone", column = "ex_phone"),
            @Result(property = "date", column = "ex_date"),
            @Result(property = "sex", column = "ex_sex"),
            @Result(property = "addr", column = "ex_addr"),
            @Result(property = "email", column = "ex_email"),
            @Result(property = "img", column = "ex_img"),
    })
    //选择所有专家
    public List<ExpertEntity> selectAllExpert();

    @Select("select * from tb_expert where " +
            "ex_expertise like CONCAT('%',#{expertise},'%') and ex_company like CONCAT('%',#{company},'%') and ex_name like CONCAT('%',#{name},'%')")
    @Results(value = {
            @Result(property = "id", column = "ex_id", id = true),
            @Result(property = "name", column = "ex_name"),
            @Result(property = "usrId", column = "ex_usrId"),
            @Result(property = "company", column = "ex_company"),
            @Result(property = "expertise", column = "ex_expertise"),
            @Result(property = "post", column = "ex_post"),
            @Result(property = "phone", column = "ex_phone"),
            @Result(property = "date", column = "ex_date"),
            @Result(property = "sex", column = "ex_sex"),
            @Result(property = "addr", column = "ex_addr"),
            @Result(property = "email", column = "ex_email"),
            @Result(property = "img", column = "ex_img"),
    })
    //模糊查询专家信息
    public List<ExpertEntity>selectExpert(@Param("name")String name,@Param("expertise")String expertise,@Param("company")String company);

    @Delete("delete from tb_expert where ex_id = #{id}")
    //删除专家
    public void deleteExpert(int id);

    @Insert("insert into tb_expert values " +
            "(null,0,#{name},#{company},#{post},#{expertise},#{phone},#{date},#{sex},#{addr},#{email},#{img})")
    //增加专家
    public void insertExpert(ExpertEntity expertEntity);
}
