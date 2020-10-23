package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author 周垣枳
 * @desc 病害实体类
 * @data 2020/10/23 11:53
 */
@Data
public class SicknessEntity {
    private int id;
    private String name;
    private String cause; //病原
    private String pasttern; //发病症状
    private String law; //发病规律
    private String damange;  //主要危害
    private String treat; //防治措施
    private String img; //病害图片

}
