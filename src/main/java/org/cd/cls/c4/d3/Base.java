package org.cd.cls.c4.d3;

import lombok.Data;

/**
 * @description: 继承的细节
 * @author: Mr.Wang
 * @create: 2019-09-01 16:09
 **/
@Data
public class Base {
    private String member;


    /**
     * 没有无参构造的时候，任何子类都必须在构造方法中通过 super 调用 Base 的带 数构造方法
     * @param member
     */
    public Base(String member) {
        this.member = member;
    }


    public Base() {
        test();
    }

    /**
     * 子类可以重写父类非 private 的方法，当调用的时候，会动态绑定，执行子类的方法
     */
    public void test(){}
}
