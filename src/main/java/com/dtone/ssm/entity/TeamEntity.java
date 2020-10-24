package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/23 17:15
 */
@Data
public class TeamEntity {
    private int id;
    private String name;
    private String peo;
    private String tel;
    private String area;
    private int num;
    private Date date;
    private ZoneEntity zone;
}
