package org.cd.cls.c5.d1;

import java.util.Arrays;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-01 20:49
 **/
public class Point implements MyComparable {
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

    /**
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(Object other) {
        if(!(other instanceof Point)){
            throw new IllegalArgumentException();
        }
        Point point = (Point) other;
        double delta = distance() - point.distance();
        if(delta < 0)
            return -1;
        else if(delta > 0)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public static void main(String[] args) {
        /*MyComparable p1 = new Point(2,3);
        MyComparable p2 = new Point(1,2);
        System.out.println(p1.compareTo(p2));*/

        Point[] points = new Point[]{new Point(2,3),new Point(3,4),new Point(1,2)};
        System.out.println("max:" + CompUtil.max(points));
        CompUtil.sort(points);
        System.out.println("sort:"+ Arrays.toString(points));
    }
}
