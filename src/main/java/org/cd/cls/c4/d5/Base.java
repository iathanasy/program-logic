package org.cd.cls.c4.d5;

/**
 * @description: 重载和重写
 * 重载是指方法名称相同但参数签名不同（参数个数、类型或顺序不同）。
 * 重写是指子类重写与父类相同参数签名的方法 对一个函数调用而言，可能有多个匹配的方法，有时候
 * 选择哪一个并不是那么明显
 * @author: Mr.Wang
 * @create: 2019-09-01 16:36
 **/
public class Base {
    public int sum(int a, int b){
        System.out.println("base_int_int");
        return a+b;
    }

    /**
     * 是否是这个子类，进行向下转型
     * @param base
     * @return
     */
    public boolean canCast(Base base){
        boolean flag = false;
        if(base instanceof Child){
            flag = true;
        }/*else if(base instanceof Child1){
            flag = true;
        }*/
        return flag;
    }
}
