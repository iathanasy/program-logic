package org.cd.cls.c5.d3;

/**
 * @description: 抽象类
 * 抽象类和接口是配合而非替代关系，它们经常一起使用，接口声明能力，抽象类提供
 * 默认实现，实现全部或部分方法，一个接口经常有一个对应的抽象类。
 * Java内库中的抽象
     * Collection 接口和对应的 AbstractCollection 抽象类
     * List 接口和对应的 AbstractList 抽象类
     * Map 接口和对应的 AbstractMap 抽象类
 *
 * 对于需要实现接口的具体类而言，有两个选择：一个是实现接口 ，自己实现全部方法；
 * 另一个则是继承抽象类，然后根据需要重写方法
 *
 * @author: Mr.Wang
 * @create: 2019-09-01 21:26
 **/
public abstract class Shape implements IShape{

    public abstract void draw();

    /**
     * 抽象已经实现，子类不需要强制实现
     */
    @Override
    public void hello() {
        System.out.println("hello");
    }
}
