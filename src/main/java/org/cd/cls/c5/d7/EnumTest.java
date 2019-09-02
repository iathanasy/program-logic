package org.cd.cls.c5.d7;

/**
 * @description: 枚举测试
 * 枚举类型都实现了 Java API 中的 Comparable 接口,都可 以通过方 compareTo与其他枚举值进行比较
 * 比较其实就是比较 ordinal 的大小
 * @author: Mr.Wang
 * @create: 2019-09-02 22:04
 **/
public class EnumTest {

    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.toString());
        System.out.println(size.name());

        System.out.println(size==Size.SMALL);
        System.out.println(size.equals(Size.SMALL));
        System.out.println(size==Size.MEDIUM);
        //ordinal表示枚举值在 明时的顺 ，从0开始，
        System.out.println(size.ordinal());

        System.out.println(size.compareTo(Size.MEDIUM));
        //枚举类型都有一个静态的 valueOf(String）方法
        System .out.println(Size.SMALL==Size.valueOf ("SMALL"));

        //有一个静态的 values 方法，所有枚举值数组
        for(Size s: Size.values()){
            System.out.println(s);
        }


        Size0 s0 = Size0.MEDIUM;
        System.out.println(s0.getAbbr());//M
        s0 = Size0.fromAbbr("L");
        System.out.println(s0.getTitle());//大号
    }


    /**
     * 枚举变量可以用于和其他类型变量一样的地方
     * @param size
     */
   static void onChosen(Size size){
        switch(size){
            case SMALL:
                System.out.println("small"); break;
            case MEDIUM:
                System.out.println("medium"); break;
            case LARGE:
                System.out.println("large"); break;
        }
   }
}
