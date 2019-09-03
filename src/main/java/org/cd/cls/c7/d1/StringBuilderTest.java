package org.cd.cls.c7.d1;

/**
 * @description: 基本用法
 * @author: Mr.Wang
 * @create: 2019-09-03 21:26
 **/
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //在循环内部， 每一次+= 操作，都 生成 StringBuilder
        //简单的拼接可以使用 += ,复杂的需要用StringBuilder.
        sb.append("hello");
        //这个实现思路是：在确保有足够长度后，首先将原数组中 offset 开始的内容向后挪动n
        //个位置， n为待插入字符串的长度，然后将待插入字符串复制进 offset 位置
        sb.insert(0,"java,");
        sb.append(",word");
        System.out.println(sb.toString());
    }
}
