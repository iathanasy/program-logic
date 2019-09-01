package org.cd.cls.c4.d6;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-01 19:50
 **/
public class Child extends Base{
    @Override
    protected void step1() {
        System.out.println("child step"+ this.currentStep);
    }

    @Override
    protected void step2() {
        System.out.println("child step"+ currentStep);
    }



    /**
     * 基类定义了表示对外行为的方法 action ，并定义了可以被子类重写的两个步骤 stepl （）和
     * step2 （），以及被子类查看的变量 currentStep ，子类通过重写 protected 方法 stepl （）和 step 2()
     * 来修改对外的行为
     * @param args
     */
    public static void main(String[] args) {
        Child c = new Child();
        c.action();
    }
}
