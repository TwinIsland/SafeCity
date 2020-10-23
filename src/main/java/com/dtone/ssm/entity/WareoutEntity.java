package com.dtone.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author mac
 * @date 2020/10/23  15:03
 * @desc 药剂出库管理的实体类
 */
@Data //自动生成
public class WareoutEntity
{
    private int out_id;
    private Date date;
    private String out_class;
    private String out_person;
}
