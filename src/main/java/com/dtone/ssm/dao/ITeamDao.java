package com.dtone.ssm.dao;


import com.dtone.ssm.entity.SicknessEntity;
import com.dtone.ssm.entity.TeamEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*
* ITeamDao
*
*
* */
@Mapper//扫描映射器接口
public interface ITeamDao {
    //更改负责人名
    @Update("update tb_team set zo_id=#{zo_id} where tn_id=#{tn_id}")
    public Boolean  updateInfo(String tn_id,String zo_id);

    //更改负责人电话号码
    @Update("update tb_team set tn_num=#{num} where tn_id=#{tn_id}")
    public Boolean updateNumById(String tn_id,String num);

    //添加小班
    @Insert("insert into tb_team values(#{teamEntity.tn_id})")
    public Boolean addItemByPart(TeamEntity teamEntity);


    //模糊查询Team
    public List<TeamEntity> selectIdByNum(@Param("id") String zoid, @Param("num") String num);
}

