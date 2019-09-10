package org.cd.collection.c11.d2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: 3.简单的容器
 * @author: Mr.Wang
 * @create: 2019-09-10 22:01
 **/
public class MyCollection<E> extends AbstractCollection<E> {
    DynamicArray<E> darr;

    public MyCollection(){
        darr = new DynamicArray<>();
    }
    public MyCollection(Collection<? extends E> c){
        this();
        addAll(c);
    }

    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator<>(darr);
    }

    @Override
    public int size() {
        return darr.size();
    }

    @Override
    public boolean add(E e) {
        darr.add(e);
        return true;
    }
}
