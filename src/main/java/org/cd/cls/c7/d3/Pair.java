package org.cd.cls.c7.d3;

/**
 * @description: 选项和权量的类Pair
 * @author: Mr.Wang
 * @create: 2019-09-03 23:02
 **/
public class Pair {
    private Object item;
    private int weight;

    public Pair(Object item, int weight) {
        this.item = item;
        this.weight = weight;
    }

    public Object getItem() {
        return item;
    }

    public int getWeight() {
        return weight;
    }
}
