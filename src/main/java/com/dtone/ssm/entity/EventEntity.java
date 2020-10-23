package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

@Data
public class EventEntity {
    int id;
    String name;
    Date date;
    int status;
    String img;
    String desc;
    String find;
    String type;
    int team; //小班id
    float loss; //损失
    float area; //影响面积
    String suggestion;
    String suggestion_p; //可null
}
