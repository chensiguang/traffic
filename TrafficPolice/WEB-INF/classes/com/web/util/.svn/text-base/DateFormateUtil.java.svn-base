/**
 * Project Name:TrafficPolice
 * File Name:DateFormateUtil.java
 * Package Name:com.web.util
 * Date:2013-8-29下午05:51:31
 * Copyright (c) 2013, chenzhou1025@126.com All Rights Reserved.
 *
 */

package com.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:DateFormateUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2013-8-29 下午05:51:31 <br/>
 * 
 * @author ws
 * @version
 * @since JDK 1.6
 * @see
 */
public class DateFormateUtil
{
    static String REG = "yyyy-MM-dd";

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(REG);

    public static String dateformate(String reg, Date newdate)
    {
        if (!reg.equals(REG))
        {
            REG = reg;
            simpleDateFormat = new SimpleDateFormat(REG);
        }
        return simpleDateFormat.format(newdate);

    }
}
