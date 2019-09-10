package org.cd.collection.c9.d1;

import java.util.*;

/**
 * @description: 列表和队列
 * @author: Mr.Wang
 * @create: 2019-09-09 21:30
 **/
public class ListTest {

    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(123);
        array.add(456);
        array.add(789);
        Integer[] arrA = new Integer[3];
        array.toArray(arrA);
        System.out.println(Arrays.toString(arrA));

        List list = new LinkedList(Arrays.asList(new String[]{"a","b","c"}));
        System.out.println(list);

        Queue queue = new LinkedList();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        while (queue.peek() != null){
            System.out.println(queue.poll());
        }


        System.out.println("z".hashCode());
    }
}
