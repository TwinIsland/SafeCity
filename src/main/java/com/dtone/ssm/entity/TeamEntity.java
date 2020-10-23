package com.dtone.ssm.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data//自动生成get(),set(),toString()方法
@AllArgsConstructor
public class TeamEntity {
    //小班名称
    private String tnid;
    private String zoid;//负责人名称
    private String name;//负责区域名称
    private String part;//地类
    private int num;//人员数量
    private String tel;//人员电话号码
    private String date;//创建日期
}
