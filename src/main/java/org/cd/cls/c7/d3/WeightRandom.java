package org.cd.cls.c7.d3;

import java.util.Arrays;
import java.util.Random;

/**
 * @description: 带权重的选择WeightRandom
 * @author: Mr.Wang
 * @create: 2019-09-03 23:03
 **/
public class WeightRandom {
    private Pair[] options;
    private double[] cumulativeProbabilities;
    private Random random;

    public WeightRandom(Pair[] options) {
        this.options = options;
        this.random = new Random();
        prepair();
    }

    /**
     * prepare （）方法计算每个选项的累计概率，保存在数组 cumulativeProbabilities 中
     * nextltem（）方法根据权重随机选择一个，具体就是，首先生成一个0~1 数，然后使用
     * 二分查找，如果没找到，返回结果是 -（插入点）-1 ，所以 -index-1 就是插入点，插入点的
     * 位置就对应选项的索引
     */
    private void prepair(){
        int weights = 0;
        for (Pair pair: options) {
            weights += pair.getWeight();
        }
        cumulativeProbabilities = new double[options.length];
        int sum = 0;
        for(int i = 0; i < options.length; i++){
            sum += options[i].getWeight();
            cumulativeProbabilities[i] = sum / (double)weights;
        }
    }

    public Object nextItem(){
        double randomValue = random.nextDouble();
        int index = Arrays.binarySearch(cumulativeProbabilities, randomValue);
        if(index < 0){
            index = -index-1;
        }
        return options[index].getItem();
    }

    public static void main(String[] args) {
        Pair[] options = new Pair[]{new Pair("1元", 7),
                new Pair("2元", 2),new Pair("10元", 1)
        };
        WeightRandom random = new WeightRandom(options);
        for (int i = 0; i < 10; i++){
            System.out.print(random.nextItem()+ " ");
        }
    }
}
