package org.cd.cls.c4.d2;

import lombok.Data;

/**
 * @description: 带箭头直线
 * @author: Mr.Wang
 * @create: 2019-09-01 15:22
 **/
@Data
public class ArrowLine extends Line{
    private boolean startArrow;
    private boolean endArrow;

    /**
     * 这里 ArrowLine 继承了 Line ，也可以直接在类 Line 里加上属性，而不
     * 需要单独设计 个类 ArrowLine ，这里主要是演示继承的层级性
     * @param start
     * @param end
     * @param color
     * @param startArrow
     * @param endArrow
     */
    public ArrowLine(Point start , Point end , String color,boolean startArrow, boolean endArrow) {
        //此处需要调用父类的有参构造，因为父类没有定义无参构造
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }

    @Override
    public void draw() {
        super.draw();
        if(startArrow){
            System.out.println("draw start arrow");
        }
        if(endArrow){
            System.out.println("draw end arrow");
        }
    }
}
