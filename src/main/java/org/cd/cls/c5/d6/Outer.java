package org.cd.cls.c5.d6;

/**
 * @description: 方法内部类
 * @author: Mr.Wang
 * @create: 2019-09-02 21:51
 **/
public class Outer {
    private int a = 100;
    public void test(final int param){
        final String str = "hello";
        class Inner{
            public void innerMethod(){
                System.out.println("Outer a "+ a);
                System.out.println("param "+ param);
                System.out.println("local var "+ str);
            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }



    public static void main(String[] args) {
        Outer o = new Outer();
        o.test(123);
    }
}
