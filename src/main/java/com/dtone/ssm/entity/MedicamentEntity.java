package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author mac
 * @date 2020/10/23  11:18
 * @desc
 */
@Data
public class MedicamentEntity
{
    private int med_id;
    private String med_name;
    private String med_ptype;
    private String med_type;
    private String med_purpose;
    private int med_count;
}
