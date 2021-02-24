package Lesson6.Task1;


import java.util.Arrays;

public class List implements MySuperArray {
    private Integer[] array;

    public List() {
        array = new Integer[0];
    }

    public List(int index) {
        array = new Integer[index];
    }

    //Получить текущую длину массива
    @Override
    public int getLength() {
        return array.length;
    }

    //Добавить элемент. Длинна массива должна увеличится на 1.
    @Override
    public Integer[] addElement(Integer element) {
        Integer[] newArray = new Integer[getLength() + 1];
        if (getLength() >= 0) System.arraycopy(array, 0, newArray, 0, getLength());
        newArray[getLength()] = element;
        array = newArray;
        return newArray;
    }

    //Получить элемент по индексу
    @Override
    public Integer getElement(int index) {
        if (index > array.length) {
            System.out.println("ВЫход за рамки массива, MAX_Index: " + (array.length - 1));
        }
        return array[index];
    }

    //Удалить все текущие элементы (длина массива будет 0 псосле этой операции)
    @Override
    public void removeAllElements() {
        array = new Integer[0];

    }

    //Вернуть массив где находятся все текущие элементы
    @Override
    public Integer[] getAllElements() {
        return Arrays.copyOf(array, getLength());
    }
}
