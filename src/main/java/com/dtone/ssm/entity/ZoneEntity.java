package com.dtone.ssm.entity;

import lombok.Data;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/23 17:12
 */
@Data
public class ZoneEntity {
    private int id;
    private String area;
    private String forest;
    private String land;
    private String tree;
    private String team;

    public ZoneEntity(int id, String area, String forest, String land, String tree, String team) {
        this.id = id;
        this.area = area;
        this.forest = forest;
        this.land = land;
        this.tree = tree;
        this.team = team;
    }
}
