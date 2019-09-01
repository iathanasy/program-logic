package org.cd.cls.c5.d2;

/**
 * @description: Java8和Java9对接口的增强
 * 针对接口编程是一种重要的程序思维方式，
 * 这种方式不仅可以复用代码，还可以降低辑合，提高灵活性，是分解复杂问题的一种重要工具
 *
 * @author: Mr.Wang
 * @create: 2019-09-01 21:19
 **/
public interface IDemo {

    void hello();

    /**
     * Java 8中，静态方法和默认方法都必须是 public 的， Java 9去除了这个限制，它
     * 们都可以是 private的， 引人 private 方法主要是为了方便多个静态或默认方法复用代码
     * 可通过IDemo.test()
     */
    public static void test(){
        System.out.println("hello");
    }

    default void hi(){
        System.out.println("hi");
    }

}
