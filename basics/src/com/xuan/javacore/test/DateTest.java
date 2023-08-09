package com.xuan.javacore.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lirongxuan
 * @version 1.0
 * @date 2023/8/9 9:33
 * @Description: TODO
 */
public class DateTest {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);


        cal.setTime(a);

        cal.getTime();



    }



}
