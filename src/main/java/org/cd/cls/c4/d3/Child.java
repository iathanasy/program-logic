package org.cd.cls.c4.d3;

/**
 * @description: 子类继承父类
 * @author: Mr.Wang
 * @create: 2019-09-01 16:11
 **/
public class Child extends Base{
    private int a = 123;
    public Child(){}

    public Child(String member) {
        super(member);
    }

    @Override
    public void test() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Child child = new Child();//会先初始化父类，父类无参构造调用了test()方法，
        child.test();
        //0  ??
        /**
         * 第一次输出是在 new 过程
         * 中输出的，在 new 过程中，省先是初始化父类，父类构造方法调用 test（）方法， test（）方
         * 被子类重写了，就会调用子类的 test （）方法，子类方法访问子类实例变量 ，而这个时候
         * 类的实例变量的赋值语句和构造方法还没有执行，所以输出的是其默认值0
         *
         * 像这样，在父类构造方法中调用可被子类重写的方法，是一种不好的实践，容易引
         * 温淆，应该只调用 private 的方法。
         */
        //123
    }
}
