package org.cd.cls.c7.d2;

import java.util.Arrays;
import java.util.Random;

/**
 * @description: 随机场景是洗牌，就是将一个数组或序列随机重新排列
 * @author: Mr.Wang
 * @create: 2019-09-03 22:49
 **/
public class RandomShuffle {

    public static void main(String[] args) {
        int[] arr = new int[13];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        //调用 shuffle 方法前， arr 是排好序的
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        //shuffle 的基本思路是什么呢？
        // 从后往前，逐个给每个数组位置重新赋值 ，值是从剩下的元素中随机挑选的
        //  swap(arr, i-1, random.nextInt(i));  i-1 表示当前要赋值的位置， random.nextlnt(i）表示从剩下的元素中随机挑选
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 随机重排
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void shuffle(int[] arr){
        Random random = new Random();
        for (int i = arr.length; i > 1; i--){
            swap(arr, i-1, random.nextInt(i));
        }
    }
}
