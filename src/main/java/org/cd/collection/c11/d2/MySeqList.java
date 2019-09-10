package org.cd.collection.c11.d2;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;

/**
 * @description: 6.基于AbstractSequentialList的实现
 * @author: Mr.Wang
 * @create: 2019-09-10 22:20
 **/
public class MySeqList<E> extends AbstractSequentialList {
    private DynamicArray<E> darr;

    public MySeqList(){
        darr = new DynamicArray<>();
    }
    public MySeqList(Collection<? extends E> c){
        this();
        addAll(c);
    }

    @Override
    public ListIterator listIterator(int index) {
        return new DynamicArrayListIterator(index, darr);
    }

    @Override
    public int size() {
        return darr.size();
    }
}
