package org.cd.cls.c7.d2;

import java.util.Random;

/**
 * @description: 随机密码
 * @author: Mr.Wang
 * @create: 2019-09-03 22:20
 **/
public class RandomPassword {

    public static void main(String[] args) {
        System.out.println(randomPass(10));
    }

    /**
     * 生成随机密码
     * @return
     */
    public static String randomPass(int count) {
        char[] chars = new char[count];
        Random random = new Random();
        if (count == 6) {
            for (int i = 0; i < chars.length; i++) {
                chars[i] = (char) ('0' + random.nextInt(10));
            }
        } else if (count == 8) {
            for (int i = 0; i < chars.length; i++) {
                chars[i] = nextChar(random);
            }
        } else if (count == 10){
            return randomPassWord(count);
        }
        return String.valueOf(chars);
    }


    /**
     * 生成随机密码 简单8位
     */
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";
    private static char nextChar(Random random){
        switch(random.nextInt(4)){
            case 0:
                return (char)('a'+random.nextInt(26));
            case 1:
                return (char)('A'+random.nextInt(26));
            case 2:
                return (char)('0'+random.nextInt(10));
            default:
                return SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
        }
    }

    /**
     * 生成随机密码 复杂8位
     * 至少要含一个大写字母、一个小写字母、一个特殊符号、一个数字。
     * @param chars
     * @param random
     * @return
     */
    private static int nextIndex(char[] chars, Random random){
        int index = random.nextInt(chars.length);
        while(chars[index] != 0){
            index = random.nextInt(chars.length);
        }
        return index;
    }
    private static char nextSpecialChar(Random random){
        return SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
    }
    private static char nextUpper1Letter(Random random){
        return (char)('A'+ random.nextInt(26));
    }
    private static char nextLowerLetter(Random random){
        return (char)('a'+ random.nextInt(26));
    }
    private static char nextNumLetter(Random random){
        return (char)('0'+ random.nextInt(10));
    }

    public static String randomPassWord(int count){
        char[] chars = new char[count];
        Random random = new Random();
        chars[nextIndex(chars, random)] = nextSpecialChar(random);
        chars[nextIndex(chars, random)] = nextUpper1Letter(random);
        chars[nextIndex(chars, random)] = nextLowerLetter(random);
        chars[nextIndex(chars, random)] = nextNumLetter(random);
        for (int i = 0; i < chars.length; i++){
            if(chars[i]==0){
                chars[i] = nextChar(random);
            }
        }
        return String.valueOf(chars);
    }

}
