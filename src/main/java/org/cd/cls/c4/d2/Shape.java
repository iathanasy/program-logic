package org.cd.cls.c4.d2;

import lombok.Data;

/**
 * 图形
 * @description: 代码清单2
 * @author: Mr.Wang
 * @create: 2019-09-01 15:05
 **/
@Data
public class Shape {
    private static final String DEFAULT_COLOR = "black";
    private String color;

    public Shape() {
        //默认颜色
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    /**
     * 绘制方法
     */
    public void draw(){
        System.out.println("draw Shape .");
    }
}
