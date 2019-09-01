package org.cd.cls.c3.d4;

import lombok.Data;

/**
 * @description: 代码清单4
 * @author: Mr.Wang
 * @create: 2019-09-01 14:42
 **/
@Data
public class Person {
    //姓名
    private String name;
    //父亲
    private Person father;
    //母亲
    private Person mother;
    //孩子数组
    private Person[] children;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person laoma = new Person("老马");
        Person xiaoma = new Person("小马");
        xiaoma.setFather(laoma) ;
        laoma.setChildren(new Person[]{xiaoma}) ;
        System.out.println(xiaoma.getFather().getName());
    }
}
