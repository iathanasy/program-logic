package org.cd.cls.c7.d1;

import java.util.Random;

/**
 * @description: 抢红包算法
 * @author: Mr.Wang
 * @create: 2019-09-03 23:33
 **/
public class RandomRedPacket {
    private int leftMoney;
    private int leftNum;
    private Random random;

    public RandomRedPacket(int leftMoney, int leftNum) {
        this.leftMoney = leftMoney;
        this.leftNum = leftNum;
        this.random = new Random();
    }

    public synchronized int nextMoney(){
        if(this.leftNum <= 0){
            throw new IllegalStateException("抢光了");
        }
        if(this.leftNum == 1){
            return this.leftMoney;
        }
        //如果大于1，则计算平均值，并设定随机最大值为平均值的两倍，然后取一个随机值，
        //如果随机值小于0.01，则为 0.01 ，这个随机值就是下一个的红包金额
        double max = this.leftMoney /this.leftNum * 2d;
        int money = (int)(random.nextDouble() * max);
        money = Math.max(1, money);
        this.leftMoney -= money;
        this.leftNum--;
        return money;
    }

    public static void main(String[] args) {
        RandomRedPacket randomRedPacket = new RandomRedPacket(1000, 10);
        for (int i = 0; i < 10; i++){
            System.out.print(randomRedPacket.nextMoney()+ " ");;
        }

        //如果并发性很高，会产生竞争，这时，可以考虑使用多线程库中的ThreadLocalRandom.
        //另外， Java 类库中还有一个随机类 SecureRandom ，安全性更高、随机性更强的随机数，用于安全加密等领域
    }
}
