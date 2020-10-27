/**
 * @program: safecity
 * @description: md5Util
 * @author: TwinIsland
 * @create: 2020-10-27 10:49
 **/

package com.dtone.ssm.util;

import org.springframework.util.DigestUtils;

public class md5 {
    static public String salt = "ajisd&1273989!*(!***asd";

    public static String getMD5(String str) {
        String base = str + "/" + salt;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }
}

