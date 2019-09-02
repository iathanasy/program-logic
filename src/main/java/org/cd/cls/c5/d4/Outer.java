package org.cd.cls.c5.d4;

/**
 * @description: 静态内部类
 * @author: Mr.Wang
 * @create: 2019-09-02 21:40
 **/
public class Outer {

    public static int shared = 100;
    public static class StaticInner{
        public void innerMethod(){
            System.out.println("inner "+ shared);
        }
    }

    public void test(){
        StaticInner si = new StaticInner();
        si.innerMethod();
    }

    /**
     * 外部调用
     * Outer.StaticInner si = new Outer.StaticInner();
     * si.innerMethod();
     */

}
