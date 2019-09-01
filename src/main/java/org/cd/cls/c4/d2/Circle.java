package org.cd.cls.c4.d2;

import lombok.Data;

/**
 * @description: 圆
 * @author: Mr.Wang
 * @create: 2019-09-01 15:09
 **/
@Data
public class Circle extends Shape{
    //中心点
    private Point center;
    //半径
    private double r;

    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw circle at "+ center.toString() + "with r"+ r +", using color："+ getColor());
    }

    public double area(){
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Point center= new Point(2,3);
        //创建圆，赋值给circle
        Circle circle = new Circle(center,2);
        // 调用 draw方法，会执行Circle draw方法
        circle.draw();
        //输出圆面积
        System.out.println(circle.area()) ;
    }
}
