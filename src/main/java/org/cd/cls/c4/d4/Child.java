package org.cd.cls.c4.d4;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-01 16:25
 **/
public class Child extends Base {
    public static String s = "static_child_base";
    public String m = "child";

    public static void staticTest(){
        System.out.println("child static："+ s);
    }

    /**
     * 当通过 （静态类型 Base ）访问时，访问的是 Base 的变量和方法，当通过 （静态类型
     * Child ）访问时，访问的是 Child 的变量和方法，这称之为静态绑定，即访问绑定到变量的
     * 静态类型。静态绑定在程序编译阶段即可决定，而动态绑定则要等到程序运行时。
     * 实例变量、静态变量、静态方法、 private 方法，都是静态绑定的
     * @param args
     */
    public static void main(String[] args) {
        Child c = new Child();
        Base b = c;
        System.out.println(b.s);
        System.out.println(b.m);
        b.staticTest();

        System.out.println("----------------------");

        System.out.println(c.s);
        System.out.println(c.m);
        c.staticTest();
    }

}
