package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author mac
 * @date 2020/10/23  17:30
 * @desc
 */
@Data
public class TakeListEntity
{
    private int id;
    private String date;
    private String name;
    private String team;
    private int count;
    private String medName;
    private String medPType;
    private String medType;
}
