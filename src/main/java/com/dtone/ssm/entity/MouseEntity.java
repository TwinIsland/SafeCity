package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author 周垣枳
 * @desc 鼠害实体类
 * @data 2020/10/23 14:22
 */
@Data
public class MouseEntity {
    private int id;
    private String name;
    private String breed;
    private String food;
    private String enemy;
    private String damage;
    private String prevent;
    private String img;

}
