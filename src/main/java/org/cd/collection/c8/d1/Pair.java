package org.cd.collection.c8.d1;

/**
 * @description: 简单泛型
 * @author: Mr.Wang
 * @create: 2019-09-04 21:14
 **/
public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    /**
     * 泛型方法 类型参数为T ，放在返回值前面
     * 根据传入的值在数组中寻找
     * @param arr
     * @param elm
     * @param <T>
     * @return
     */
    public static <T> int indexOf(T[] arr, T elm){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(elm)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        //可以这样使用
        //Pair<Integer> pair = new Pair<Integer>(1, 100);
        //也可以这样
        Pair<String> pair = new Pair<String>("hello", "word");
        System.out.println(pair.getFirst()+ ", "+ pair.getSecond());

        System.out.println(indexOf(new Integer[]{1, 3, 4, 5,6,8}, 8));
        System.out.println(indexOf(new String[]{"java", "spring", "spark", "kafka", "hadoop"}, "spring"));
    }
}
