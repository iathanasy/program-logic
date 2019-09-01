package org.cd.cls.c4.d6;

/**
 * @description: 继承访问权限
 * @author: Mr.Wang
 * @create: 2019-09-01 19:48
 **/
public class Base {
    protected int currentStep;
    protected void step1(){}
    protected void step2(){};

    /**
     * 这种思路和设计是 种设计模式，称之为模板方法 action 方法就是一个模板方法，
     * 它定义了实现的模板，而具体实现则由 子类提供
     *
     * final不能被重写
     */
    public final void action(){
        this.currentStep = 1;
        step1();
        this.currentStep = 2;
        step2();
    }
}
