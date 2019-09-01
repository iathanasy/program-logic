package org.cd.cls.c3.d2;

/**
 * @description: 3章代码清单2
 * @author: Mr.Wang
 * @create: 2019-09-01 13:53
 **/
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
