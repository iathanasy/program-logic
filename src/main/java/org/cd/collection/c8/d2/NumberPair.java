package org.cd.collection.c8.d2;

/**
 * @description: 类型参数限定  上界为某个具体类
 * @author: Mr.Wang
 * @create: 2019-09-04 21:51
 **/
public class NumberPair<U extends Number, V extends Number> extends Pair<U, V> {

    public NumberPair(U first, V second) {
        super(first, second);
    }

    public double sum(){
        return getFirst().doubleValue() + getSecond().doubleValue();
    }

    /**
     * 上界为某个接口
     * < T extends Comparable<T>>是一种令人费解的语法形式，这种形式称为递归类型限制，
     * 可以这么解读: T表示一种数据类型，必须实现 Comparable 接口 ，且必须可以与相同
     * 类型的元素进行 比较.
     *
     * @param arr
     */
    public static <T extends Comparable<T>> T max(T[] arr){
        T max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        NumberPair<Integer, Double> pair = new NumberPair<>(10, 12.34);
        System.out.println(pair.sum());
    }
}
