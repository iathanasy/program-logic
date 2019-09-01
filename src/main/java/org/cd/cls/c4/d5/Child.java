package org.cd.cls.c4.d5;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-01 16:37
 **/
public class Child extends Base{

    public long sum(long a, long b) {
        System.out.println("child_long_long");
        return a+b;
    }



    /**
     * 当有多个重名函数的时候，在决定要调用哪个函
     * 数的过程中，首先是按照参数类型进行匹配的，换句话说，寻找在所有重载版本中最匹配
     * 的，然后才看变量的动态类型，进行动态绑定.
     * @param args
     */
    public static void main(String[] args) {
        Child c = new Child();
        int a = 3;
        int b = 4;
        c.sum(a, b);

        System.out.println("-----------------------");
        //父子类型转换
        /**
         * 一个父类的变量能不能转换为一个子类的变量，取决于这个父类变量的动态类型（即引用
         * 的对象类型） 是不是这个子类或这个子类的子类
         *
         */
        Base b1 = new Child1();
        if(b1.canCast(b1)) {
            Child c1 = (Child) b1;
            c1.sum(1L, 3L);
        }else{
            System.out.println("不是当前子类型！");
        }
    }
}
