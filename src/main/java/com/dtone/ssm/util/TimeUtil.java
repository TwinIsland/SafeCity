/**
 * @program: safecity
 * @description: time util
 * @author: TwinIsland
 * @create: 2020-10-27 18:25
 **/

package com.dtone.ssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String getCurTime(){
        Date a = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyMMddHHmm");
        return sd.format(a);
    }
}

