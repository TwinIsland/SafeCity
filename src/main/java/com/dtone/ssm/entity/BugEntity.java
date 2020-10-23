package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author 周垣枳
 * @desc 虫害实体类
 * @data 2020/10/23 11:11
 */
@Data //自动生成getter setter tostring方法
public class BugEntity {
    private int id;
    private String name;
    private String breed;   //繁殖
    private String host;    //寄主
    private String enemy;   //天敌
    private String damage; //主要危害
    private String prevent; //防治
    private String larva; //定义幼虫图片
    private String adult; //定义成虫图片
}
