package org.cd.cls.c5.d5;

/**
 * @description: 成员内部类
 * @author: Mr.Wang
 * @create: 2019-09-02 21:47
 **/
public class Outer {
    private int a = 100;

    public class Inner{
        public void innerMethod(){
            System.out.println("outer a:"+ 100);
            action();
        }
    }

    private void action(){
        System.out.println("action");
    }

    public void test(){
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
