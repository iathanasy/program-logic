package org.cd.collection.c11.d2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @description: 5.实现ListIterator
 * @author: Mr.Wang
 * @create: 2019-09-10 22:13
 **/
public class DynamicArrayListIterator<E> extends DynamicArrayIterator<E> implements ListIterator<E> {

    public DynamicArrayListIterator(int index, DynamicArray<E> darr) {
        super(darr);
        this.cursor = index;
    }

    @Override
    public boolean hasPrevious() {
        return cursor > 0;
    }

    @Override
    public E previous() {
        if(!hasPrevious()){
            throw new NoSuchElementException();
        }
        cursor--;
        lastRet = cursor;
        return darr.get(lastRet);
    }

    @Override
    public int nextIndex() {
        return cursor;
    }

    @Override
    public int previousIndex() {
        return cursor - 1;
    }

    @Override
    public void set(E e) {
        if(lastRet == -1){
            throw new IllegalStateException();
        }
        darr.set(lastRet, e);
    }

    @Override
    public void add(E e) {
        darr.add(cursor, e);
        cursor++;
        lastRet = -1;
    }
}
