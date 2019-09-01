package org.cd.cls.c4.d2;

/**
 * @description: 图形管理器 重要
 * @author: Mr.Wang
 * @create: 2019-09-01 15:28
 **/
public class ShapeManager {
    private static final int MAX_NUM = 100;
    private Shape[] shapes = new Shape[MAX_NUM];
    private int shapeNum = 0;

    /**
     * ShapeManager 使用 个数组保存所有的 shape ，在 draw 方法中调用每个 shape draw
     * 方法 ShapeManager 并不知道每个 shape 具体的类型，也不关心，但可以调用到子类的
     * draw 方法
     * @param shape
     */
    public void addShape(Shape shape){
        if(shapeNum < MAX_NUM){
            shapes[shapeNum++] = shape;
        }
    }

    /**
     * 绘制
     */
    public void draw(){
        for (int i = 0; i < shapeNum; i++){
            shapes[i].draw();
        }
    }

    /**
     * 变量 Shape 可以引用任何 Shape 子类类型的对象，这叫多态 ，即一种类型的变量，可
     * 引用多种实际类型对象 这样，对于变量 shape ，它就有两个类型：类型 Shape ，我们称
     * 之为 shape 的静态类型； 类型 Circle/Line/ArrowLine ，我们称之为 shape 的动态类型.
     * ShapeManager draw 方法中， shapes[i].draw（）调用的是其对应动态类型的 draw 方法，
     * 称之为方法的动态绑定
     * @param args
     */
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(new Point(4,4), 3));//绘制圆
        //绘制直线
        manager.addShape(new Line(new Point(2,3), new Point(3,4), "green"));
        //绘制带箭头直线
        manager.addShape(new ArrowLine(new Point(1,2), new Point(5,5),"black",false, true));
        manager.draw();
    }
}
