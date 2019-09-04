package org.cd.collection.c8.d2;

import java.util.Arrays;
import java.util.Random;

/**
 * @description: 动态数组
 * @author: Mr.Wang
 * @create: 2019-09-04 21:26
 **/
public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private Object[] elementData;

    public DynamicArray() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity){
        //10
        int oldCapacity = elementData.length;
        if(oldCapacity >= minCapacity){
            return ;
        }
        int newCapacity = oldCapacity * 2;
        if(newCapacity < minCapacity){
            newCapacity = minCapacity;
        }
        //动态扩容
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public void add(E e){
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }

    public E get(int index){
        return (E) elementData[index];
    }

    public int size(){
        return size;
    }

    public E set(int index, E e){
        E oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }

    /**
     * 添加全部
     * 这么写会有一定的局限性，如下代码
     * DynamicArray<Number> numbers = new DynamicArray<>();
     * DynamicArray<Integer> ints = new DynamicArray<>();
     * ints.add(1);
     * ints.add(2);
     * numbers.addAll(ints); //会提示编译错误？？？
     * 因为numbers是一个Number类型容器， ints是一个Integer类型的容器，我们希望将ints添加到numbers中，
     * 因为Integer是Number的子类。这是一个合理的需求。
     * 但是 numbers.addAll(ints)这行代码提示编译错误，addAll需要的参数类型为DynamicArray<Number> ，而
     * 传递过来的是DynamicArray<Integer> ，不适用。但Integer是Number的子类，怎么会不适用呢。我们改造下代码
     *
     *
     *
     * @param c
     */
    public void addAll(DynamicArray<E> c){
        for (int i = 0; i < c.size; i++){
            add(c.get(i));
        }
    }

    /**
     *
     * 现在通过限定类型来解决了上面的问题
     * E 是 DynamicArray<Number>类型的参数
     * T 是 DynamicArray<Integer> 类型的参数
     * T 的上界限定为E.这样就没有问题了。
     * @param c
     * @param <T>
     *
     * 这种写法有点繁琐，下面方法有通配符的解决方案
     */
    public <T extends E> void addAll0(DynamicArray<T> c){
        for (int i = 0; i < c.size; i++){
            add(c.get(i));
        }
    }

    /**
     * 通配符简洁方案
     * 这个方法没有定义类型参数，c的类型是DynamicArray<? extends E> ，？表示通配符。
     * <? extends E>表示有限定通配符，匹配E或E的子类型，具体什么子类型是未知的。
     * @param c
     */
    public void addAll2(DynamicArray<? extends E> c){
        for (int i = 0; i < c.size; i++){
            add(c.get(i));
        }
    }


    /**
     * 后面两中方案有什么不一样呢？
     * 同样是 extends 关键字 同样应用于泛型 < T extends E＞和 <? extends E>到底有什么关系，它们用的地方不一样，
     * 1）<T extends E> 用于定义类型参数，它声明了一个类型的参数为T,可放在泛型类定义中类名后面、泛型方法返回值前面。
     * 2）<? extends E> 用于实例化类型参数，它用于实例化泛型变量中的类型参数，只是这个具体的参数是未知的，只知道他是E或E的某个子类。
     */


    /**
     * 将src 器中的内容复制到 dest 中
     * S和D有依赖关系，要么相同，要么S是D的子类，否则类型不兼容，有编译错误。
     * @param dest
     * @param src
     * @param <D>
     * @param <S>
     */
    public static <D,S extends D> void copy(DynamicArray<D> dest, DynamicArray<S> src){
        for (int i = 0; i < src.size; i++){
            dest.add(src.get(i));
        }
    }

    /**
     * 带通配符的不能写入
     * 只能读，不能写
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(DynamicArray<?> arr, int i, int j){
        Object tmp = arr.get(i);
        /*arr.set(i, arr.get(j)); //编译错误
        arr.set(j, tmp);*/
    }

    /**
     * 重写上面的方法，改为泛型T
     * @param arr
     * @param i
     * @param j
     * @param <T>
     */
    public static <T> void swap0(DynamicArray<T> arr, int i, int j){
        T tmp = arr.get(i);
        arr.set(i, arr.get(j)); //编译错误
        arr.set(j, tmp);
    }

    /**
     * 两个参数可简化为一个
     * 注意：如果返回值依赖于参数类型，则不能用通配符。
     * @param dest
     * @param src
     * @param <D>
     */
    public static <D> void copy0(DynamicArray<D> dest, DynamicArray<? extends D> src){
        for (int i = 0; i < src.size; i++){
            dest.add(src.get(i));
        }
    }

    /**
     * 返回值依赖参数类型， 不能用通配符
     * @param arr
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> T max(DynamicArray<T> arr){
        T max = arr.get(0);
        for (int i = 0; i < arr.size; i++){
            if(arr.get(i).compareTo(max) > 0){
                return arr.get(i);
            }
        }
        return max;
    }


    /**
     * 总结：
     * 1.通配符形式都可以用类型参数的形式来替代，通配符能做的，用类型参数都能做。
     * 2.通配符形式可以减少类型参数，形式上往往更为简单，可读性也更好，所以，能用通配符就用通配符。
     * 3.如果类型参数之间有依赖关系， 或者返回值依赖类型参数，或者需要写操作，则只能使用类型参数。
     * 4.通配符形式和类型参数往往配合使用，比如上面的copy方法，定义必要的类型参数，使用通配符表达依赖，
     *   并接受更广泛的数据类型。
     */

    public static void main(String[] args) {
        DynamicArray<Number> numbers = new DynamicArray<>();
        DynamicArray<Integer> ints = new DynamicArray<>();
        ints.add(1);
        ints.add(2);
        //numbers.addAll(ints);//编译错误
        //numbers.addAll0(ints);
        numbers.addAll2(ints);

        DynamicArray<Double> arr = new DynamicArray<>();
        Random random = new Random();
        int size = random.nextInt(100);
        for (int i = 0; i < size; i++){
            arr.add(Math.random());
        }
        Double d = arr.get(random.nextInt(size));
        System.out.println(d);
        System.out.println(Arrays.toString(arr.elementData));
    }
}
