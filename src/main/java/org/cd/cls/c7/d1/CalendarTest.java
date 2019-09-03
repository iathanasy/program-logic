package org.cd.cls.c7.d1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @description: 基本用法
 * @author: Mr.Wang
 * @create: 2019-09-03 21:53
 **/
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar= Calendar.getInstance();
        System.out.println("year: "+calendar.get(Calendar.YEAR));//：表示年
        System.out .println ("mdnth :"+calendar.get(Calendar . MONTH));//表示月， 1月是 0,
        System.out.println ("day :"+calendar. get(Calendar.DAY_OF_MONTH));//表示日，每月的第一天是1
        System.out.println(" hour :"+calendar . get(Calendar . HOUR_OF_DAY));//表示小时，为0~23
        System.out.println ("minute : " +calendar . get(Calendar.MINUTE));//表示分钟，0~59
        System . out.println ("second :" + calendar.get(Calendar.SECOND));//表示秒， 0~59
        System.out.println("millisecond ：" + calendar.get(Calendar.MILLISECOND));//毫秒， 0~999
        System.out.println("day_of_week :"+ calendar.get(Calendar.DAY_OF_WEEK));//表示星期几，周日是1 ，周一是2 ，周六是 7

        //DateFormat格式化 2016-08-15 14 : 15:20
        calendar.set(2016, 07, 15 , 14, 15 , 20);
        System.out.println(DateFormat.getDateTimeInstance().format(calendar.getTime()));
        System.out.println(DateFormat.getDateInstance().format(calendar.getTime()));
        System.out.println(DateFormat.getTimeInstance().format(calendar.getTime()));

        //SimpleDateFormat 是DateFormat 的子类，相比 DateFormat ，它的一个主要不同是，它
        //可以接受一个自定义的模式（ pattern ）作为参数，这个模式规定了 Date 的字符串形式
        //DateFormat/SimpleDateFormat 不是线程安全的
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒 a");
        System.out.println(df.format(calendar.getTime()));
    }
}
