package org.cd.cls.c4.d7;

/**
 * @description:  继承实现的基本原理
 * Base 括一个静态变量 ，一个实例变量 ，一段静态初始化代码块，一段实例初始化代码块，
 * 一个构造方法，两个方法 step action
 *
 * @author: Mr.Wang
 * @create: 2019-09-01 19:59
 **/
public class Base {
    public static int s;
    private int a;

    static{
        System.out.println("Base 静态代码块，s:"+s);
        s = 1;
    }
    {
        System.out.println("Base 实例代码块，a:"+a);
        a = 1;
    }

    public Base(){
        System.out.println("Base 构造方法，a:"+ a);
        a = 2;
    }

    protected void step(){
        System.out.println("base s:"+s +", a:"+a);
    }

    public final void action(){
        System.out.println("start");
        step();
        System.out.println("end");
    }
}
