package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author mac
 * @date 2020/10/27  18:35
 * @desc
 */
@Data
public class RecordEntity
{
    private int id;
    private Date date;
    private String person;
    private String result;
}
