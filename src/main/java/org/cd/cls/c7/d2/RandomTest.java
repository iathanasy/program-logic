package org.cd.cls.c7.d2;

import java.util.Random;

/**
 * @description: 随机数
 * @author: Mr.Wang
 * @create: 2019-09-03 22:18
 **/
public class RandomTest {

    public static void main(String[] args) {
        Random r = new Random();
        //随机产生100以内的随机数
        System.out.println(r.nextInt(100));
    }
}
