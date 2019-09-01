package org.cd.cls.c5.d3;

import org.cd.cls.c5.d3.Shape;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-01 21:27
 **/
public class Circle  extends Shape {
    /**
     * 抽象方法，子类必须实现
     */
    @Override
    public void draw() {
        System.out.println("绘制");
    }

    /**
     * 接口中的方法，如果抽象类没有实现，子类必须强制实现
     */
    @Override
    public void color() {
        System.out.println("black");
    }
}
