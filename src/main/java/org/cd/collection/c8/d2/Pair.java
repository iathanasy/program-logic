package org.cd.collection.c8.d2;

/**
 * @description: 不同类型泛型
 * @author: Mr.Wang
 * @create: 2019-09-04 21:19
 **/
public class Pair<U, V> {
    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    /**
     * 多个泛型参数
     * @param first
     * @param second
     * @param <U>
     * @param <V>
     * @return
     */
    public static <U, V> Pair<U, V> makePair(U first, V second){
        Pair<U, V> pair = new Pair<>(first, second);
        return pair;
    }

    /**
     * 对于泛型类，Java编译器会将Java源代码替换为.class文件，虚拟机加载并运行.class文件
     * 会将类型参数U V 擦除，替换为Object,插入必要的强制类型转换。
     * 虚拟机世界执行的时候，并不知道泛型这回事，只知道普通类及代码。
     * @param args
     */
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("hello", 1);
        makePair("key","value");
    }
}
