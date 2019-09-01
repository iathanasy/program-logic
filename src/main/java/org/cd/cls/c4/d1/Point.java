package org.cd.cls.c4.d1;

import lombok.Data;

/**
 * @description: 代码清单1
 * @author: Mr.Wang
 * @create: 2019-09-01 13:53
 **/
@Data
public class Point {
    private int x;
    private int y;

    /**
     * 默认构造
     */
    public Point(){
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY() , 2));
    }

    /**
     * 默认  getClass().getName （）返回 前对象的类名， hashCode（）返回一个对象的哈希
     * 重新toString方法
     * @return
     */
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point p =new Point(2,3 );
        System.out.println(p.toString());
    }

}
