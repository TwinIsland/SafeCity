package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 周垣枳
 * @desc 日志功能实体类
 * @data 2020/10/23 9:54
 */
@Data //自动生成getter setter和tostring方法
public class LogEntity {
    private int id;
    private String content;
    private String date;
}
