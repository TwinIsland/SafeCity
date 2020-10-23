package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ExpertEntity {
    int id;
    String name;
    String company;
    String expertise;
    int usrId; //专家在user表的id属性
    String phone;
    Date date;
    String sex;
    String addr;
    String email;
    String img;
}
