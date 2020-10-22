package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author: 周垣枳
 **/
@Data //自动生成getter setter和tostring方法
public class UserEntity {
    private int id;
    private String name;
    private String password;
    private String level;
    private String realname;
}
