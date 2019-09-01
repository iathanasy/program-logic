package org.cd.cls.c3.d1;

/**
 * @description: 3章代码清单1
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

    /**
     * 在程序运行的时候，当第一次通过 new 创建一个类的对象时，或者直接通过类名访问
     * 类变量和类方法时， Java 会将类加载进内存，为这个类分配一块空间，这个空间会包括类
     * 的定义、它的变量和方法信息，同时还有类的静态变量，并对静态变量赋初始值.
     * @param args
     */
    public static void main(String[] args) {
        /**
         *  Point p = new Point();
         * 创建对象，做了两件事
         * 1 ）分配内存，以存储新对象的数据，对象数据包括这个对象的属性，具体包括其实例变量 x 和 y
         * 2）给实例变量设置默认值， int 类型默认值为0
         */
        Point p = new Point();
        /*p.x = 2;//public可以使用其赋值
        p.y = 3;*/
        p.setX(2);//private 需写get set
        p.setY(3);


        System.out.println(p.distance());
    }
}
