package org.cd.cls.c4.d4;

/**
 * @description: 重名与静态绑定
 * @author: Mr.Wang
 * @create: 2019-09-01 16:22
 **/
public class Base {
    public static String s = "static_base";
    public String m = "base";

    public static void staticTest(){
        System.out.println("base static："+ s);
    }
}
