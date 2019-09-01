package org.cd.cls.c4.d2;

import lombok.Data;

/**
 * @description: 直线
 * @author: Mr.Wang
 * @create: 2019-09-01 15:18
 **/
@Data
public class Line extends Shape{
    private Point start ;
    private Point end;

    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
    }

    public double length(){
        return start.distance(end);
    }

    @Override
    public void draw() {
        System.out.println("draw line from "+ start.toString() +" to "+ end.toString() + ", using color:"+ super.getColor());
    }
}
