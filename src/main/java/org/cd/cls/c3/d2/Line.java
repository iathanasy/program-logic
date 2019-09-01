package org.cd.cls.c3.d2;

/**
 * @description: 3章代码清单2
 * @author: Mr.Wang
 * @create: 2019-09-01 14:09
 **/
public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length(){
        return start.distance(end);
    }

    /**
     * 内存地址分配
     *                   栈                                 堆
     *           地址       内容            |        地址             内容
     *  start    0x8000      0x1000        ->        0x 1000          2(start.x)  |  0x 1004          3(start.y)
     *  end      0x8008      0x1008        ->        0x 1008          3(start.x)  |  0x 1000          4(start.y)
     * line      0x8010      0x1010        ->        0x 1010          0x1000(line.start)  |  0x 1014          0x1008(line.end)
     *
     * @param args
     */
    public static void main(String[] args) {
        Point start = new Point(2, 3);
        Point end = new Point(3, 4);
        Line line = new Line(start, end);
        System.out.println(line.length());
    }
}
