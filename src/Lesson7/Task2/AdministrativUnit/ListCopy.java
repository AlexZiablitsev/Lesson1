package Lesson7.Task2.AdministrativUnit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListCopy<T> implements ListService<T> {

    private T[] array;
    private Class clazz;


    public ListCopy(Class<T> tClass) {
        this.array = (T[]) Array.newInstance(tClass, 0);
        this.clazz = tClass;
    }


    @Override
    public int getLength() {
        return this.array.length;
    }

    @Override
    public T[] addElement(T element) {
        T[] newArray = (T[]) Array.newInstance(this.clazz, getLength() + 1);
        if (this.getLength() >= 0) System.arraycopy(this.array, 0, newArray, 0, this.getLength());
        newArray[getLength()] = element;
        array = newArray;
        return array;
    }

    public T[] addAllElements(T[] elements){
        T [] newArray = (T[]) Array.newInstance(this.clazz, getLength() + elements.length);
        if (this.getLength() >= 0) System.arraycopy(this.array, 0, newArray, 0, this.getLength());
        System.arraycopy(elements, getLength(), newArray, getLength(), getLength() + elements.length - getLength());
        this.array = newArray;
        return newArray;
    }

    @Override
    public T getElement(int index) {
        return this.array[index];
    }


    @Override
    public T[] getAllElements() {
        return this.array;
    }

    @Override
    public String toString() {
        String str = "";
        for (T item : array) {
            str += item.toString() + " ";
        }
        return str;
    }
}
