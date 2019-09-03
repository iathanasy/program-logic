package org.cd.cls.c7.d1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description: 基本用法
 * @author: Mr.Wang
 * @create: 2019-09-03 21:34
 **/
public class ArraysTest {
    public static void main(String[] args) {
        int[] arrs = {9, 8 ,3, 4};
        //排序
        Arrays.sort(arrs);

        //字符串
        String[] arr = {"hello", "world", "Break", "abc"};
        //Arrays.sort(arr);//因为大写字母的 ASCII 码比小写字母都小   [Break, abc, hello, world]
        //Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); //大小写就忽略了 [abc, Break, hello, world]

        //自定义从大到小
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);//[world, hello, Break, abc]
            }
        });

        //二分查找 必须是排好序的 返回对应下标， 没找到返回-1
        System.out.println(Arrays.binarySearch(arrs, 8));
        //hashCode: 与String计算的算法类似，数组中的每个元素都影响hash值，位置不同
        //影响也不同，使用31一方面产生的哈希值更分散，另一方面效率也比较高
        System.out.println(Arrays.hashCode(arrs));

        System.out.println(Arrays.toString(arrs));
        System.out.println(Arrays.toString(arr));

        /**
         * Apache 有一个开源包（ http://commons.apache.org/proper/commons-lang／），里面有一个
         * ArrayUtils （位于包 org.apache.commons.lang3 ），包含了更多的常用数组操作。
         */
    }
}
