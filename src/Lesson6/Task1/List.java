package Lesson6.Task1;


import java.util.Arrays;

public class List implements MySuperArray {
    private int[] array = new int[0];

    //Получить текущую длину массива
    @Override
    public int getLength() {
        return array.length;
    }

    //Добавить элемент. Длинна массива должна увеличится на 1.
    @Override
    public int[] addElement(Integer element) {
        int[] newArray = new int[getLength() + 1];
        if (getLength() >= 0) System.arraycopy(array, 0, newArray, 0, getLength());
        newArray[getLength()] = element;
        array = newArray;
        return newArray;
    }

    //Получить элемент по индексу
    @Override
    public Integer getElement(int index) {
        return array[index];
    }

    //Удалить все текущие элементы (длина массива будет 0 псосле этой операции)
    @Override
    public void removeAllElements() {
        array = new int[0];

    }

    //Вернуть массив где находятся все текущие элементы
    @Override
    public int [] getAllElements() {
        return Arrays.copyOf(array, getLength());
    }
}
