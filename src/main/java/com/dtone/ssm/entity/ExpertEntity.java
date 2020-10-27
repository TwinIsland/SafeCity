package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExpertEntity {
    private int id;
    private String name;
    private String company;
    private String expertise;
    private String post;
    private int usrId; //专家在user表的id属性
    private  String phone;
    private  Date date;
    private String sex;
    private  String addr;
    private  String email;
    private String img;
}
